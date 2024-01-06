package com.beingabroad.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/being")
public class InstituteController {

    // testEndPoint,
    @GetMapping("/test/{st}")
    @ResponseStatus(code = HttpStatus.CONTINUE)
    public String testEndPoint(@PathVariable String st) {
        return "Welcome! "+st;
    }
}
