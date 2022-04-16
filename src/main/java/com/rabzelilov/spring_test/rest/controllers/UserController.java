package com.rabzelilov.spring_test.rest.controllers;

import com.rabzelilov.spring_test.mappers.UserMapper;
import com.rabzelilov.spring_test.rest.models.UserDto;
import com.rabzelilov.spring_test.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
//@RequestMapping("/home")
public class UserController {

    private final UserService userService;

    private final UserMapper userMapper;

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }


    @GetMapping("users/{username}")
    public UserDto getUser(@PathVariable String username){
        return userService.getUser(username);
    }










}
