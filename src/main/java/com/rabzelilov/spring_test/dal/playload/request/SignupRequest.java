package com.rabzelilov.spring_test.dal.playload.request;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SignupRequest {
    @NotNull
    private String username;

    @NotNull
    private String email;

    private Set<String> role;

    @NotNull
    private String password;
}
