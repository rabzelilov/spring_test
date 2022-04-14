package com.rabzelilov.spring_test.dal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "role_id_seq")
    @SequenceGenerator(
            name = "role_id_seq",
            sequenceName = "SEQ_ROLE",
            allocationSize = 1
    )
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private ERole name;

//    @ManyToMany(mappedBy = "roles",fetch = FetchType.EAGER)
//    private Collection<Role> roles=new ArrayList<>();

}
