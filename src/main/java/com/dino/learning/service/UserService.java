package com.dino.learning.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.dino.learning.shared.dto.UserDto;

public interface UserService extends UserDetailsService {
	UserDto createUser(UserDto user);
}
