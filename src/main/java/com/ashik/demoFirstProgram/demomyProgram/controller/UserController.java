package com.ashik.demoFirstProgram.demomyProgram.controller;

import com.ashik.demoFirstProgram.demomyProgram.model.User;
import com.ashik.demoFirstProgram.demomyProgram.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class UserController {

    @Autowired
    UserRepository userRepository;


    @GetMapping
    public User getUser(@RequestParam Integer id){
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }

    @GetMapping("/newuser")
    public User getUser(){
        User user = new User();
        user.setId(5);
        user.setName("Saman");
        user.setAge(25);
        return user;
    }

    @GetMapping("/all")
    @ResponseBody
    @CrossOrigin("*")
    public Iterable<User> getAllusers(){
        return userRepository.findAll();
    }
}
