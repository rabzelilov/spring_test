package com.rabzelilov.spring_test.dal.playload.response;



import com.rabzelilov.spring_test.dal.entity.Role;
import lombok.*;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class JwtResponse {

    @NonNull
    private String token;

    private String type = "Bearer";
    @NonNull
    private Long id;
    @NonNull
    private String username;
    @NonNull
    private String email;

    @NonNull
    private List<String> roles;

}
