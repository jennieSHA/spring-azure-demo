package com.example.UserService.service;

import com.example.UserService.model.User;

import java.util.List;

public interface UserService {
    User getUserById(Long userId);

    User createUser(User user);

    User updateUser(Long userId, User user);

    void deleteUser(Long userId);

    List<User> getAllUsers();
}
