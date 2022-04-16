package com.rabzelilov.spring_test.dal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "role")
public class Role {
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE,
//            generator = "seq_role")
//    @SequenceGenerator(
//            name = "seq_role",
//            sequenceName = "seq_role",
//            allocationSize = 1
//    )
//    @Column(name = "id")
//    private Long id;
//
//    @Column(name = "name")
//    @Enumerated(EnumType.STRING)
//    private ERole name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;
//    @ManyToMany(mappedBy = "roles",fetch = FetchType.EAGER)
//    private Collection<Role> roles=new ArrayList<>();

}
