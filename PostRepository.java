package com.example.twitterapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.twitterapp.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
