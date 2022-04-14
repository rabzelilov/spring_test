package com.rabzelilov.spring_test.rest.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id",
        scope = UserDto.class)
public class UserDto {
    private Long id;
    private String name;
    private String email;
    private String password;
    private List<RoleDto> roleDtoList;
}
