package com.rabzelilov.spring_test.dal.repository;

import com.rabzelilov.spring_test.dal.entity.ERole;
import com.rabzelilov.spring_test.dal.entity.Role;
import com.rabzelilov.spring_test.dal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(ERole name);
}
