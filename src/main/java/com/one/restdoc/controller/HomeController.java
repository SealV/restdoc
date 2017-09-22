package com.one.restdoc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/greeting")
    public Map<String, Object> greeting(String message) {
        return Collections.singletonMap("message", "Hello World2" + message);
    }


    @GetMapping("/book")
    public Map<String, Object> book(String name) {
        return Collections.singletonMap("book", "name:" + name);
    }
}
