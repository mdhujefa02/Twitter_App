package com.example.twitterapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.twitterapp.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
   User findByusername(String username);
   User save(User userDto);
}
