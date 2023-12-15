package com.example.demo.ey.services;

import com.example.demo.ey.models.User;
import com.example.demo.ey.models.dto.UserDto;

public interface UserService {
	User createUser(UserDto userRequest) throws Exception;
}
