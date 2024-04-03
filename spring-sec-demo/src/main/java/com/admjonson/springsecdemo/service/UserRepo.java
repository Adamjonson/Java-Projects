package com.admjonson.springsecdemo.service;

import com.admjonson.springsecdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUserName(String username);
}
