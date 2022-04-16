package com.rabzelilov.spring_test.service.impl;

import com.rabzelilov.spring_test.dal.entity.Role;
import com.rabzelilov.spring_test.dal.entity.User;
import com.rabzelilov.spring_test.dal.repository.RoleRepository;
import com.rabzelilov.spring_test.dal.repository.UserRepository;
import com.rabzelilov.spring_test.mappers.RoleMapper;
import com.rabzelilov.spring_test.mappers.UserMapper;
import com.rabzelilov.spring_test.rest.models.RoleDto;
import com.rabzelilov.spring_test.rest.models.UserDto;
import com.rabzelilov.spring_test.security.UserDetailsImpl;
import com.rabzelilov.spring_test.service.UserService;
import java.util.List;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserServiceImpl implements UserService, UserDetailsService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final UserMapper userMapper;
    private final RoleMapper roleMapper;

    @Override
    public UserDto save(UserDto userDto) {
        log.info("Save new user {}", userDto.getName());
        User user = userMapper.dtoToModel(userDto);
        return userMapper.modelToDto(userRepository.save(user));
    }

    @Override
    public void remove(Long id) {
        log.info("Delete user with id {}", id);
        userRepository.deleteById(id);
    }

    @Override
    public UserDto getUser(String username) {
        Optional<User> user = userRepository.findByUsername(username);
        if (user.isPresent()) {
            return userMapper.modelToDto(user.get());
        }
        throw new UsernameNotFoundException("Couldn't find user with given username");
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
    public Long saveRole(RoleDto roleDto) {
        log.info("Save new user {}", roleDto.getName());
        Role role = roleRepository.save(roleMapper.dtoToModel(roleDto));
        return role.getId();
    }

}
