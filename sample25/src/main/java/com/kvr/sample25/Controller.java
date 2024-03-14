package com.kvr.sample25;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/Home")
    public String api() {
        return "Welcome to SpringBoot";
    }
}
