package com.web.demo.InterviewSchedularEx.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.web.demo.InterviewSchedularEx.dto.UserDto;
import com.web.demo.InterviewSchedularEx.model.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
	
	@Mapping(target = "password",ignore = true)
	UserDto toUserDto(User user);

	User toUser(UserDto User);
}
