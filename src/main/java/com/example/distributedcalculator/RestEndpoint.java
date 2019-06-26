package com.example.distributedcalculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEndpoint {

    @GetMapping("/ping")
    PingResponse ping() {
        return  new PingResponse("pong");
    }
    @GetMapping("/modulus")
    IntValue modulus(@RequestParam int n1, @RequestParam int n2) {
        return new IntValue(n1 % n2);
    }
}
