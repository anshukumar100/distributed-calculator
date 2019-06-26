package com.example.distributedcalculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEndpoint {
    @GetMapping("/modulus")
    int modulus(@RequestParam int a, @RequestParam int b) {
        return a % b;
    }
}
