package com.rabzelilov.spring_test.service;

import com.rabzelilov.spring_test.dal.entity.PassportStrain;
import com.rabzelilov.spring_test.rest.models.DnaDto;
import com.rabzelilov.spring_test.rest.models.PassportStrainDto;

import java.util.List;


public interface PassportStrainService {
    PassportStrainDto save (PassportStrainDto passportStrainDto);
    void remove(Long id);
    PassportStrainDto getPassportStrain(Long id);
    PassportStrainDto getPassportStrain(String passportStrainName);
    List<PassportStrainDto> getPassportStrains();
}
