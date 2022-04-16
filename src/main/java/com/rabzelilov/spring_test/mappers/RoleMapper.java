package com.rabzelilov.spring_test.mappers;


import com.rabzelilov.spring_test.dal.entity.Role;
import com.rabzelilov.spring_test.rest.models.RoleDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    RoleDto modelToDto(Role role);
    Role dtoToModel(RoleDto roleDto);
    List<RoleDto> modelToDts(List<Role> roleList);
}
