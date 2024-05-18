package com.velamdir.AssigmentSubmissionAndReviewApp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.velamdir.AssigmentSubmissionAndReviewApp.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
	Optional<User> findByUsername(String username);

}
