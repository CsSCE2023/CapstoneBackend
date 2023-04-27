package com.capstone.capstone.auth.service;

import com.capstone.capstone.auth.dto.UserDto;
import com.capstone.capstone.auth.entities.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}