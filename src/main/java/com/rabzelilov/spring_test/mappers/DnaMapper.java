package com.rabzelilov.spring_test.mappers;

import com.rabzelilov.spring_test.dal.entity.Dna;
import com.rabzelilov.spring_test.rest.models.DnaDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DnaMapper {
    DnaDto toDto(Dna dna);
    Dna toDna(DnaDto dnaDto);
    List<DnaDto> toDts(List<Dna> dnaList);
}
