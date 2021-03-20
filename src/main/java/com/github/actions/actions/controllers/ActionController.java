package com.github.actions.actions.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ActionController {

    @GetMapping("/")
    public ResponseEntity getStart(){
        HashMap<String,String> x = new HashMap<>(){{
           put("msg","nex2Me");
        }};
        return ResponseEntity.ok(x);
    }

}
