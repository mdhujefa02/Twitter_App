package com.example.twitterapp.config;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.twitterapp.model.User;
import com.example.twitterapp.repository.UserRepository;

@Service
public class CustomUserDetailService implements UserDetailsService {

	private UserRepository userRepository;
	
	
	public CustomUserDetailService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userRepository.findByusername(username);
		if (user==null) {
			throw new UsernameNotFoundException("Username and Password not found");
		}
		return new CustomerUserDetails(user.getUsername(), user.getPassword(), authorities());
	}


	private Collection<? extends GrantedAuthority> authorities() {
		// TODO Auto-generated method stub
		return Arrays.asList(new SimpleGrantedAuthority("User"));
	}

	

}
