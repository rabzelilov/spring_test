package com.rabzelilov.spring_test.service.impl;

import com.rabzelilov.spring_test.dal.entity.Role;
import com.rabzelilov.spring_test.dal.entity.User;
import com.rabzelilov.spring_test.dal.repository.RoleRepository;
import com.rabzelilov.spring_test.dal.repository.UserRepository;
import com.rabzelilov.spring_test.rest.models.UserDto;
import com.rabzelilov.spring_test.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserServiceImpl implements UserService, UserDetailsService {
    private final UserRepository userRepository;
    private final UserService userService;
    private final RoleRepository roleRepository;

    @Override
    public UserDto save(UserDto userDto) {
        log.info("Save new user {}", userDto.getName());
        return userService.save(userDto);
    }

    @Override
    public void remove(Long id) {
        log.info("Delete user with id {}", id);
        userRepository.deleteById(id);
    }

    @Override
    public UserDto getUser(String username) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

        return UserDetailsImpl.build(user);
    }

    @Override
    public List<User> getUsers() {
        log.info("Get users");
        return userRepository.findAll();
    }


    @Override
    public Role saveRole(Role role) {
        log.info("Save new user {}", role.getName());
        return roleRepository.save(role);
    }

}
