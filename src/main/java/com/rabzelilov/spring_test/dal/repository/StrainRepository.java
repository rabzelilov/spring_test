package com.rabzelilov.spring_test.dal.repository;

import com.rabzelilov.spring_test.dal.entity.Strain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StrainRepository extends JpaRepository<Strain,Long> {
    Strain findByStrainName(String strainName);
}
