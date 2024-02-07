package com.example.UserService.repository;

import com.example.UserService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo  extends JpaRepository<User, Long> {
}
