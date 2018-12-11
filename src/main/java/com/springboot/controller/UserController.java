package com.springboot.controller;

import com.springboot.common.UserRoot;
import com.springboot.repository.UserReopsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserReopsitory userReopsitory;

    @GetMapping("/users")
    public List<UserRoot> getAllUsers(){
        return userReopsitory.findAll();
    }
    @PostMapping("/users")
    public UserRoot createUser(@Valid @RequestBody UserRoot userRoot) {
        return userReopsitory.save(userRoot);
    }

}
