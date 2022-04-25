package com.rabzelilov.spring_test.service;

import com.rabzelilov.spring_test.dal.entity.Dna;
import com.rabzelilov.spring_test.rest.models.DnaDto;

import java.util.List;

public interface DnaService {
    DnaDto save (DnaDto dnaDto);
    void remove(Long id);
    DnaDto getDna(Long id);
    List<DnaDto> getDnaList();
}
