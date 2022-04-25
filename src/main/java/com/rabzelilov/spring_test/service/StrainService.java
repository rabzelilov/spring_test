package com.rabzelilov.spring_test.service;

import com.rabzelilov.spring_test.dal.entity.Strain;
import com.rabzelilov.spring_test.rest.models.DnaDto;
import com.rabzelilov.spring_test.rest.models.StrainDto;

import java.util.List;

public interface StrainService {
    StrainDto save (StrainDto strainDto);
    void remove(Long id);
    StrainDto getStrainByName (String name);
    StrainDto getStrainById (Long id);
    List<StrainDto> getStrains();
}
