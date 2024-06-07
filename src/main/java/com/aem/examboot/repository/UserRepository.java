package com.aem.examboot.repository;

import com.aem.examboot.dto.UserDto;
import com.aem.examboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmail(String email);
    User findByName(String username);
    User save(UserDto userDto);
}
