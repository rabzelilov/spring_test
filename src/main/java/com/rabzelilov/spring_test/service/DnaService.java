package com.rabzelilov.spring_test.service;

import com.rabzelilov.spring_test.dal.entity.Dna;
import com.rabzelilov.spring_test.rest.models.DnaDto;

import java.util.List;

public interface DnaService {
    Dna save (Dna dna);
    void remove(Integer id);
    Dna getDna(Integer id);
    List<Dna> getDnaList();
}
