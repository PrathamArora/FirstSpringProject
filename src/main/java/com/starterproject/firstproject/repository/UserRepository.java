package com.starterproject.firstproject.repository;

import com.starterproject.firstproject.models.User;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository {
    User createUser(User user);

    Optional<User> getUserByID(UUID id);
}
