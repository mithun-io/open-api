package com.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.dto.UserRequest;
import com.dto.UserResponse;
import com.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
@Tag(name = "User API", description = "Operations related to users")
public class UserController {

	private final UserService service;
	
	// http://localhost:8080/actuator - actuator

	// http://localhost:8080/swagger-ui/index.html
	@Operation(summary = "create a new user", description = "creates a user and calculates age based on birth date")
	@PostMapping
	public UserResponse createUser(@RequestBody UserRequest userRequest) {
		return service.createUser(userRequest);
	}

	@Operation(summary = "get all users", description = "fetches all users with calculated age")
	@GetMapping
	public List<UserResponse> getAllUsers() {
		return service.getAllUsers();
	}
}
