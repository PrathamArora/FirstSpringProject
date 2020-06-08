package com.starterproject.firstproject.controllers;

import com.starterproject.firstproject.dto.ResponseDto;
import com.starterproject.firstproject.models.User;
import com.starterproject.firstproject.service.UserService;
import com.starterproject.firstproject.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(Constants.USERS_END_POINT)
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public ResponseDto<User> getUser(@PathVariable(name = "id") UUID id){
        User serviceResponse = userService.getUser(id);
        if(serviceResponse == null){
            return new ResponseDto<>(HttpStatus.NOT_FOUND, null);
        }
        return new ResponseDto<>(HttpStatus.FOUND, serviceResponse);
    }
}
