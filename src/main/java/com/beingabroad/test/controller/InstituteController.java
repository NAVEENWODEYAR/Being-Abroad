package com.beingabroad.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/being")
public class InstituteController {

    // testEndPoint,
    @GetMapping("/test/{st}")
    @ResponseStatus(code = HttpStatus.CONTINUE)
    public String testEndPoint(String st) {
        return "Welcome! "+st;
    }
}
