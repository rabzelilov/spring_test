package com.rabzelilov.spring_test.mappers;

import com.rabzelilov.spring_test.dal.entity.PassportStrain;
import com.rabzelilov.spring_test.dal.entity.Strain;
import com.rabzelilov.spring_test.dal.repository.PassportStrainRepository;
import com.rabzelilov.spring_test.rest.models.StrainDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class StrainMapper {

    @Autowired
    private  PassportStrainRepository passportStrainRepository;

    @Mapping(source = "passportStrain", target = "passportStrainId", qualifiedByName = "getPassportId")
    public abstract StrainDto toDto(Strain strain);

    @Mapping(source = "passportStrainId", target = "passportStrain", qualifiedByName = "getPassportById")
    public abstract Strain toStrain(StrainDto strainDto);

    @Named("getPassportId")
    public Long getPassportId(PassportStrain passportStrain) {
        return passportStrain.getPassportStrainId();
    }

    @Named("getPassportById")
    public PassportStrain getPassportById(Long passportStrainId) {
        return passportStrainRepository.getById(passportStrainId);
    }
}
