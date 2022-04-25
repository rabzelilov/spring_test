package com.rabzelilov.spring_test.mappers;

import com.rabzelilov.spring_test.dal.entity.User;
import com.rabzelilov.spring_test.rest.models.UserDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toUser(UserDto userDto);
    List<UserDto> toDts(List<User> userList);
}
