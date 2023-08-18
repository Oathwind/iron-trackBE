package com.example.demo.controllers;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepo;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class userController {
    @Autowired
    UserService userService;
    @Autowired
    UserRepo userRepo;

    @GetMapping("/user")
    public String getUser(){
        return "User: Test";

    }

    @PostMapping("/store")
    public User saveUser(@RequestBody User user){
        return userService.create(user);
    }
}
