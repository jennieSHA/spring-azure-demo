package com.example.UserService.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_info")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_info_seq")
    @SequenceGenerator(name = "user_info_seq", sequenceName = "user_info_sequence", allocationSize = 1)
    private Long id;

    private String username;
    private String password;
    private String email;
}
