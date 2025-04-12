package com.example.twitterapp.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.twitterapp.model.Post;
import com.example.twitterapp.repository.PostRepository;

@Service
public class PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void save(Post post) {
        post.setCreatedAt(LocalDateTime.now());
        postRepository.save(post);
    }

    public List<Post> findAll() {
        return postRepository.findAll();
    }
}

