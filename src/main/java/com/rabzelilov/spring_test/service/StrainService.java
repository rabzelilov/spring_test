package com.rabzelilov.spring_test.service;

import com.rabzelilov.spring_test.dal.entity.Strain;
import com.rabzelilov.spring_test.rest.models.DnaDto;

import java.util.List;

public interface StrainService {
    Strain save (Strain strain);
    void remove(Integer id);
    Strain getStrain(Integer id);
    List<Strain> getStrains();
}
