package com.rabzelilov.spring_test.service.impl;

import com.rabzelilov.spring_test.dal.entity.Strain;
import com.rabzelilov.spring_test.dal.repository.StrainRepository;
import com.rabzelilov.spring_test.mappers.StrainMapper;
import com.rabzelilov.spring_test.rest.Exceptions.StrainsNotFoundException;
import com.rabzelilov.spring_test.rest.models.StrainDto;
import com.rabzelilov.spring_test.service.StrainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

import static java.util.Objects.nonNull;

@Service
@RequiredArgsConstructor
@Transactional
public class StrainServiceImpl implements StrainService {

    private final StrainRepository strainRepository;
    private final StrainMapper strainMapper;

    @Override
    public StrainDto save(StrainDto strainDto) {
        Strain strain = strainMapper.toStrain(strainDto);
        return strainMapper.toDto(strainRepository.save(strain));
    }

    @Override
    public void remove(Long id) {
        strainRepository.deleteById(id);
    }

    @Override
    public StrainDto getStrainByName(String strainName) {
        Strain strain = strainRepository.findByStrainName(strainName);
        if(nonNull(strain)) {
            return strainMapper.toDto(strain);
        }
        throw new StrainsNotFoundException();
    }

    @Override
    public StrainDto getStrainById(Long id) {
        Strain strain = strainRepository.getById(id);
        return strainMapper.toDto(strain);
    }

    @Override
    public List<StrainDto> getStrains() {
        return null;
//                strainRepository.findAll().stream().map(strainMapper::toDto).toList();
    }
}
