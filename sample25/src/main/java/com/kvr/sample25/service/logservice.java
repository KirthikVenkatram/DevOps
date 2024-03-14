package com.kvr.sample25.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kvr.sample25.domain.login;
import com.kvr.sample25.repository.loginrepo;

@Service
public class logservice {
    @Autowired
    private loginrepo repo;

    public login log(String username, String password) {
        login user = repo.findByUsernameAndPassword(username, password);
        return user;
    }
}

