package com.intern.contentmanagement.controller;

import com.intern.contentmanagement.model.Users;
import com.intern.contentmanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    UserRepository userRepository;
    @GetMapping("/")
    public String home() {
        return "Hello, home!";
    }

    @GetMapping("/secured/{id}")
    public String secured(@PathVariable Integer id) {
        Users users = userRepository.findById(id).get();

        return users.getDescription();
    }

}
