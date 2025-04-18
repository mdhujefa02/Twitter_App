package com.example.twitterapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.twitterapp.model.User;
import com.example.twitterapp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	PasswordEncoder passwordEncoder;
	
	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User findByusername(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByusername(username);
	}

	@Override
	public User save(User userDto) {
		User user=new User(userDto.getUsername(), passwordEncoder.encode(userDto.getPassword()));
		return userRepository.save(user);
	}


}
