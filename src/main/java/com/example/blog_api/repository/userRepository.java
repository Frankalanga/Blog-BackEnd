package com.example.blogapi.repository;

import com.example.blogapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username); // Buscar usuario por nombre de usuario
    Optional<User> findByEmail(String email);      // Buscar usuario por email
}