package com.kvr.sample25.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kvr.sample25.domain.login;

@Repository
public interface loginrepo extends JpaRepository<login, String> {
    login findByUsernameAndPassword(String username, String password);
}
