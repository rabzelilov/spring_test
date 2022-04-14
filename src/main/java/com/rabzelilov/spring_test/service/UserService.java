package com.rabzelilov.spring_test.service;

import com.rabzelilov.spring_test.dal.entity.Role;
import com.rabzelilov.spring_test.dal.entity.User;
import com.rabzelilov.spring_test.rest.models.UserDto;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


import java.util.List;

public interface UserService {
    UserDto save (UserDto userDto);// TODO сделать везде DTO, USER используется только в мапперах, репозитории только в сервисах
    void remove(Long  id);// TODO а где тогда используется маппер?
    UserDto getUser(String username);
    List<User> getUsers();
    Role saveRole(Role role);
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
