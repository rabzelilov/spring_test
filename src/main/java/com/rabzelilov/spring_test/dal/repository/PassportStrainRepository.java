package com.rabzelilov.spring_test.dal.repository;

import com.rabzelilov.spring_test.dal.entity.PassportStrain;
import com.rabzelilov.spring_test.dal.entity.Strain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface PassportStrainRepository extends JpaRepository<PassportStrain,Long> {
    PassportStrain findByStrainName(String strainName);
}
