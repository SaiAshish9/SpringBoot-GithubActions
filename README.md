```
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
       heroku_api_key: 
       heroku_email: 
       heroku_app_name: 
```
