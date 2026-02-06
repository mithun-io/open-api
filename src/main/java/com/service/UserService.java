package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dto.UserRequest;
import com.dto.UserResponse;
import com.entity.User;
import com.mapper.UserMapper;
import com.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;
	private final UserMapper userMapper;

	public UserResponse createUser(UserRequest userRequest) {
		User user = userMapper.toUser(userRequest);
		return userMapper.toUserResponse(userRepository.save(user));
	}

	public List<UserResponse> getAllUsers() {
		return userRepository.findAll().stream().map(userMapper::toUserResponse).toList();
	}
}
