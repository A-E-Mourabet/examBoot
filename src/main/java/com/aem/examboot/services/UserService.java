package com.aem.examboot.services;

import com.aem.examboot.entity.User;
import com.aem.examboot.dto.UserDto;

import java.util.List;

public interface UserService {

    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
