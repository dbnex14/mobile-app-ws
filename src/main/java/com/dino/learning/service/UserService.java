package com.dino.learning.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.dino.learning.shared.dto.UserDto;

public interface UserService extends UserDetailsService {
	UserDto createUser(UserDto user);
	UserDto updateUser(String userId, UserDto user);
	UserDto getUser(String email);
	UserDto getUserByUserId(String userId);
	void deleteUser(String userId);
	List<UserDto> getUsers(int page, int limit);
}
