package com.rabzelilov.spring_test.mappers;


import com.rabzelilov.spring_test.dal.entity.User;
import com.rabzelilov.spring_test.rest.models.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserDto modelToDto(User user);
    User DtoToModel(UserDto userDto);
    List<UserDto> modelToDts(List<User> userList);
}
