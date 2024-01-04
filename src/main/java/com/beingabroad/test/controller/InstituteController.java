package com.beingabroad.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstituteController {

    // testEndPoint,
    @GetMapping
    @ResponseStatus(code = HttpStatus.CONTINUE)
    public String testEndPoint()
    {
        return "Welcome!";
    }
}