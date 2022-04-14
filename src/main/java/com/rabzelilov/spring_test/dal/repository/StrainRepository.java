package com.rabzelilov.spring_test.dal.repository;

import com.rabzelilov.spring_test.dal.entity.Strain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StrainRepository extends JpaRepository<Strain,Long> {
}
