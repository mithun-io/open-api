package com.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.dto.UserRequest;
import com.dto.UserResponse;
import com.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

	User toUser(UserRequest userRequest);

	@Mapping(target = "age", expression = "java(user.getBirthDate() == null ? 0 : " + "java.time.Period.between(user.getBirthDate(), java.time.LocalDate.now()).getYears())")
	UserResponse toUserResponse(User user);
}
