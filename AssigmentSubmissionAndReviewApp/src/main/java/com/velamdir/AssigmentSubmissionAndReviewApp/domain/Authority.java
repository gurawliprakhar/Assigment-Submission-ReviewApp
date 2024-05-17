package com.velamdir.AssigmentSubmissionAndReviewApp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Authority implements GrantedAuthority{
private static final long serialVersionUID = 6483927738807356279L;
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String authority;
private User user;

public Authority () {
	
}

public Authority(String Authority) {
	this.authority = authority;
}
public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getAuthority() {
	return authority;
}

public void setAuthority(String authority) {
	this.authority = authority;
}

public User getUser() {
	return user;
  }
public void setUser(User user) {
	this.user = user;
 }
   
   
}
