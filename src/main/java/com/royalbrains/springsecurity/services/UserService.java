package com.royalbrains.springsecurity.services;

import com.royalbrains.springsecurity.entities.models.User;
import com.royalbrains.springsecurity.entities.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return  userRepository.findAll();
    }

    public String createUser(User user) {
        userRepository.save(user);
        return "User created successfully";
    }
}
