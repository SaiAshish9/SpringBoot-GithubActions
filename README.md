```
# This workflow will build a Java project with Maven
# For more information see: https://help.github.com/actions/language-and-framework-guides/building-and-testing-java-with-maven

name: Java CI with Maven

on:
  push:
    branches: [ master ]
#   pull_request:
#     branches: [ master ]

jobs:
  build:

    runs-on: ubuntu-latest

    steps:
    - uses: actions/checkout@v2

    - name: Deploy to Heroku
      uses: AkhileshNS/heroku-deploy@v3.12.12
      with:
       heroku_api_key: ${{secrets.HEROKU_API_KEY}}
       heroku_email: ${{secrets.HEROKU_EMAIL}}
       heroku_app_name: ${{secrets.HEROKU_APP_NAME}}
#     - name: Set up JDK 1.8
#       uses: actions/setup-java@v1
#       with:
#         java-version: 1.8
#     - name: Build with Maven
#       run: mvn -B package --file pom.xml
```
