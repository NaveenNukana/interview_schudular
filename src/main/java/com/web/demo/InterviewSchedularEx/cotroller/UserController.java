package com.web.demo.InterviewSchedularEx.cotroller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.demo.InterviewSchedularEx.dto.UserDto;
import com.web.demo.InterviewSchedularEx.service.UserService;
@RequestMapping("/user")
@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping
	public HttpEntity<UserDto> createUser(@RequestBody UserDto userDto) {
		userDto = userService.createUser(userDto);
		return new ResponseEntity<>(userDto, HttpStatus.CREATED);
	}
}
