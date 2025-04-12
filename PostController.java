package com.example.twitterapp.controller;

import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.twitterapp.config.CustomerUserDetails;
import com.example.twitterapp.model.Post;
import com.example.twitterapp.service.PostService;
import com.example.twitterapp.service.UserService;

@Controller
public class PostController {

	private final PostService postService;
	private final  UserService userService;
	public PostController(PostService postService, UserService userService) {
		super();
		this.postService = postService;
		this.userService = userService;
	}
	@GetMapping("/")
	public String home(Model model) {
	    List<Post> posts = postService.findAll();
	    model.addAttribute("post", posts); 
	    return "home";
	}
	@GetMapping("/add")
	public String showAddPostForm(Model model) {
		model.addAttribute("post",new Post());
		return "add";
	}
	@PostMapping("/add")
	public String AddPost(@ModelAttribute Post posts) {
		Authentication auth=SecurityContextHolder.getContext().getAuthentication();
		CustomerUserDetails user=(CustomerUserDetails) auth.getPrincipal();
		var existingUser=userService.findByusername(user.getUsername());
		posts.setUser(existingUser);
		postService.save(posts);
		return "redirect:/";
	}
}
