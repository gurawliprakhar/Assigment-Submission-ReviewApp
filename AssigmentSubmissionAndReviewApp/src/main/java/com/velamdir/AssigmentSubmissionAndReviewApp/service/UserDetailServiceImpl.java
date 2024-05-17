package com.velamdir.AssigmentSubmissionAndReviewApp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.velamdir.AssigmentSubmissionAndReviewApp.domain.User;
import com.velamdir.AssigmentSubmissionAndReviewApp.util.CustomPasswordEncoder;
@Service
public class UserDetailServiceImpl implements UserDetailsService{
    @Autowired
	private CustomPasswordEncoder passwordEncoder;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = new User();
		user.setUsername(username);
		user.setPassword(passwordEncoder.getPasswordEncoder().encode("asdfasdf"));
		user.setId(1L);
		return new User();
	}

}
