package com.royalbrains.springsecurity.controllers;

import com.royalbrains.springsecurity.entities.models.User;
import com.royalbrains.springsecurity.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("all")
    public List<User> getAllUsers(){
        return  userService.getAllUsers();
    }
    @PostMapping("create")
    public String createUser(@RequestBody() User user ){
      return  userService.createUser(user);
    }
}
