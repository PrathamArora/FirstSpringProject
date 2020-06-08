package com.starterproject.firstproject.service;

import com.starterproject.firstproject.models.User;
import com.starterproject.firstproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        return userRepository.createUser(user);
    }

    public User getUser(UUID id){
        Optional<User> foundUser = userRepository.getUserByID(id);

        if(foundUser.isEmpty()){
            return null;
        }

        return foundUser.get();
    }

}
