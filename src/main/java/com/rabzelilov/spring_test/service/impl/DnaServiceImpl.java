package com.rabzelilov.spring_test.service.impl;

import com.rabzelilov.spring_test.dal.entity.Dna;
import com.rabzelilov.spring_test.dal.entity.Strain;
import com.rabzelilov.spring_test.dal.repository.DnaRepository;
import com.rabzelilov.spring_test.mappers.DnaMapper;
import com.rabzelilov.spring_test.rest.Exceptions.StrainsNotFoundException;
import com.rabzelilov.spring_test.rest.models.DnaDto;
import com.rabzelilov.spring_test.service.DnaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

import static java.util.Objects.nonNull;

@Service
@Transactional
@RequiredArgsConstructor
public class DnaServiceImpl implements DnaService {
    private final DnaRepository dnaRepository;
    private final DnaMapper dnaMapper;


    @Override
    public DnaDto save(DnaDto dnaDto) {
        Dna dna = dnaMapper.toDna(dnaDto);
        return dnaMapper.toDto(dnaRepository.save(dna));
    }

    @Override
    public void remove(Long id) {
        dnaRepository.deleteById(id);
    }

    @Override
    public DnaDto getDna(Long id) {
        Dna dna = dnaRepository.getById(id);
        return dnaMapper.toDto(dna);
    }

    @Override
    public List<DnaDto> getDnaList() {
        return dnaRepository.findAll().stream().map(dnaMapper::toDto).toList();
    }
}
