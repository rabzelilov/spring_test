package com.rabzelilov.spring_test.dal.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name="\"user\"")
@EqualsAndHashCode(of = {"email"})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "user_id_seq")
    @SequenceGenerator(
            name = "user_id_seq",
            sequenceName = "SEQ_USER",
            allocationSize = 1
    )
    @Column(name = "id")
    private Long id;

    @Column(name = "username")
    @NonNull
    private String username;

    @Column(name = "email")
    @NonNull
    private String email;

    @Column(name = "password")
    @NonNull
    private String password;

//    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//    private Set<Role> roles = new HashSet<>();
//
//    public void addRole(Role role){
//        roles.add(role);
//        role.getUsers().add(this);
//    }
//
//    public void removeRole(Role role){
//        roles.remove(role);
//        role.getUsers().remove(this);
//    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(	name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();
}
