package com.rabzelilov.spring_test.service.impl;

import com.rabzelilov.spring_test.dal.entity.Dna;
import com.rabzelilov.spring_test.dal.repository.DnaRepository;
import com.rabzelilov.spring_test.rest.models.DnaDto;
import com.rabzelilov.spring_test.service.DnaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class DnaServiceImpl implements DnaService {
    private final DnaRepository dnaRepository;

    @Override
    public Dna save(Dna dna) {
        return null;
    }


    @Override
    public void remove(Integer id) {

    }

    @Override
    public Dna getDna(Integer id) {
        return null;
    }

    @Override
    public List<Dna> getDnaList() {
        return null;
    }

}
