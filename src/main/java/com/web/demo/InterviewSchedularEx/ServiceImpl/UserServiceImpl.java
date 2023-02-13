package com.web.demo.InterviewSchedularEx.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.web.demo.InterviewSchedularEx.Repository.UserRepository;
import com.web.demo.InterviewSchedularEx.dto.UserDto;
import com.web.demo.InterviewSchedularEx.mapper.UserMapper;
import com.web.demo.InterviewSchedularEx.model.User;
import com.web.demo.InterviewSchedularEx.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired(required=false)
	private UserMapper userMapper;

	@Override
	public UserDto createUser(UserDto userDto) {
		User user = userMapper.toUser(userDto);
		User userEntity = userRepository.save(user);
		userDto=userMapper.toUserDto(userEntity);
		return userDto;
	}

}
