package com.jk.spotless.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Junaid.Khan
 *
**/    

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String hello() {

        return "Hello, World!";
    }
}
