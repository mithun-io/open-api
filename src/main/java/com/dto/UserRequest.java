package com.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "user request payload")
public class UserRequest {

	@Schema(description = "full name of the user", example = "smith")
	private String name;

	@Schema(description = "email address of the user", example = "smith@example.com")
	private String email;

	@Schema(description = "birth date of the user", example = "2000-12-31")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private LocalDate birthDate;
}