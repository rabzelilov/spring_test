package com.rabzelilov.spring_test.mappers;


import com.rabzelilov.spring_test.dal.entity.User;
import com.rabzelilov.spring_test.rest.models.UserDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto modelToDto(User user);
    User dtoToModel(UserDto userDto);
    List<UserDto> modelToDts(List<User> userList);
}
