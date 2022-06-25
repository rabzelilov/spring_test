package com.rabzelilov.spring_test.service.impl;

import com.rabzelilov.spring_test.dal.entity.PassportStrain;
import com.rabzelilov.spring_test.dal.repository.PassportStrainRepository;
import com.rabzelilov.spring_test.mappers.PassportStrainMapper;
import com.rabzelilov.spring_test.rest.Exceptions.StrainsNotFoundException;
import com.rabzelilov.spring_test.rest.models.PassportStrainDto;
import com.rabzelilov.spring_test.service.PassportStrainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

import static java.util.Objects.nonNull;

@Service
@Transactional
@RequiredArgsConstructor
public class PassportStrainServiceImpl implements PassportStrainService {
    private final PassportStrainRepository passportStrainRepository;
    private final PassportStrainMapper passportStrainMapper;

    @Override
    public PassportStrainDto save(PassportStrainDto passportStrainDto) {
        PassportStrain passportStrain = passportStrainMapper.toPassportStrain(passportStrainDto);
        return passportStrainMapper.toDto(passportStrainRepository.save(passportStrain));
    }

    @Override
    public void remove(Long id) {
        passportStrainRepository.deleteById(id);
    }

    @Override
    public PassportStrainDto getPassportStrain(String strainName) {
        PassportStrain passportStrain = passportStrainRepository.findByStrainName(strainName);
        if(nonNull(passportStrain)) {
            return passportStrainMapper.toDto(passportStrain);
        }
        throw new StrainsNotFoundException();
    }

    @Override
    public PassportStrainDto getPassportStrain(Long id) {
        PassportStrain passportStrain = passportStrainRepository.getById(id);
        return passportStrainMapper.toDto(passportStrain);
    }


    @Override
    public List<PassportStrainDto> getPassportStrains() {
        return null;
//                passportStrainRepository.findAll().stream().map(passportStrainMapper::toDto).toList();
    }
}
