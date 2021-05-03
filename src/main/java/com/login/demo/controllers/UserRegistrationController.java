package com.login.demo.controllers;

import com.login.demo.dto.UserRegistrationDto;
import com.login.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    @Autowired
    private UserService userService ;

    @GetMapping
    public String showRegistrationForm(){
        return "registration" ;
    }

    @ModelAttribute("user")
    public UserRegistrationDto getUserDto()
    {
        return new UserRegistrationDto() ;
    }

    @PostMapping
    public String register(@ModelAttribute("user") UserRegistrationDto userRegistrationDto)
    {
        userService.save(userRegistrationDto) ;
        return "redirect:/registration?success" ;
    }
}
