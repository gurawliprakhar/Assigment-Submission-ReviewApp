package com.velamdir.AssigmentSubmissionAndReviewApp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.velamdir.AssigmentSubmissionAndReviewApp.domain.User;
import com.velamdir.AssigmentSubmissionAndReviewApp.repository.UserRepository;
import com.velamdir.AssigmentSubmissionAndReviewApp.util.CustomPasswordEncoder;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    
    @Autowired
    private CustomPasswordEncoder passwordEncoder;
    
    @Autowired
    private UserRepository userRepo;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userOpt = userRepo.findByUsername(username);
        return userOpt.orElseThrow(() -> new UsernameNotFoundException("Invalid Credentials"));
    }
}
