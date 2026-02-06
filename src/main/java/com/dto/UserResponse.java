package com.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "user response payload")
public class UserResponse {

	@Schema(description = "unique user ID", example = "1")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Long id;

	@Schema(description = "full name of the user", example = "smith")
	private String name;

	@Schema(description = "email address of the user", example = "smith@example.com")
	private String email;

	@Schema(description = "calculated age based on birth date", example = "25")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private int age;
}