package com.login.demo.service;

import com.login.demo.dto.UserRegistrationDto;
import com.login.demo.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService  extends UserDetailsService {

    User save(UserRegistrationDto userRegistrationDto) ;
}
