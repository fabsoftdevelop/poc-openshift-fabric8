package com.poc.solintecno.pocopenshiftfabric8.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hola")
    String home() {
        return "Hello, World!";
    }

}
