package com.rabzelilov.spring_test.mappers;


import com.rabzelilov.spring_test.dal.entity.Role;
import com.rabzelilov.spring_test.rest.models.RoleDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);
    RoleDto modelToDto(Role role);
    Role DtoToModel(RoleDto roleDto);
    List<RoleDto> modelToDts(List<Role> roleList);
}
