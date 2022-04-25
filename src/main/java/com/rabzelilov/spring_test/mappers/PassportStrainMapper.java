package com.rabzelilov.spring_test.mappers;

import com.rabzelilov.spring_test.dal.entity.PassportStrain;
import com.rabzelilov.spring_test.rest.models.PassportStrainDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PassportStrainMapper {
    PassportStrainDto toDto(PassportStrain passportStrain);
    PassportStrain toPassportStrain(PassportStrainDto passportStrainDto);
    List<PassportStrainDto> toDts(List<PassportStrain> passportStrains);
}
