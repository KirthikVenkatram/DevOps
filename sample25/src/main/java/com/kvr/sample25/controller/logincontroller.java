package com.kvr.sample25.controller;

import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kvr.sample25.domain.login;
import com.kvr.sample25.service.logservice;

@Controller
public class logincontroller {

    @Autowired
    private logservice service;

    @GetMapping("/")
    public String api() {

        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("user") login user) {

        login oauthUser = service.log(user.getUsername(), user.getPassword());

        System.out.print(oauthUser);
        if (Objects.nonNull(oauthUser)) {
            return "redirect:/home";
        } else {
            return "redirect:/";
        }
    }

    @GetMapping("/home")
    public String display() {
        return "home";
    }
}

