package com.rabzelilov.spring_test.dal.repository;

import com.rabzelilov.spring_test.dal.entity.PassportStrain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportStrainRepository extends JpaRepository<PassportStrain,Long> {
}
