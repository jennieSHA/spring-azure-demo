package com.example.UserService.service;

import com.example.UserService.model.User;
import com.example.UserService.repository.UserRepo;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        return optionalUser.orElse(null);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(Long userId, User user) {
        Optional<User> optionalExistingUser = userRepository.findById(userId);
        if (optionalExistingUser.isPresent()) {
            User existingUser = optionalExistingUser.get();
            // Update the fields you want to change
            existingUser.setUsername(user.getUsername());
            existingUser.setPassword(user.getPassword());
            existingUser.setEmail(user.getEmail());
            return userRepository.save(existingUser);
        } else {
            return null; // User not found
        }
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}

