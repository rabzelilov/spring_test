package com.rabzelilov.spring_test.service;

import com.rabzelilov.spring_test.dal.entity.PassportStrain;
import com.rabzelilov.spring_test.rest.models.DnaDto;

import java.util.List;


public interface PassportStrainService {
    PassportStrain save (PassportStrain passportStrain);
    void remove(Integer id);
    PassportStrain getPassportStrain(Integer id);
    List<PassportStrain> getPassportStrains();
}
