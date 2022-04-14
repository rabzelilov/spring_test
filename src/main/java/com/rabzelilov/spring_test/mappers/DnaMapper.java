package com.rabzelilov.spring_test.mappers;

import com.rabzelilov.spring_test.dal.entity.Dna;
import com.rabzelilov.spring_test.rest.models.DnaDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DnaMapper {
    DnaMapper INSTANCE = Mappers.getMapper(DnaMapper.class);
    DnaDto modelToDto(Dna dna);
    Dna DtoToModel(DnaDto dnaDto);
    List<DnaDto> modelToDts(List<Dna> dnaList);
}
