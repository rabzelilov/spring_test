package com.rabzelilov.spring_test.rest.controllers;

import com.rabzelilov.spring_test.dal.entity.Dna;
import com.rabzelilov.spring_test.mappers.DnaMapper;
import com.rabzelilov.spring_test.rest.models.DnaDto;
import com.rabzelilov.spring_test.service.DnaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DnaController {

    private final DnaService dnaService;

//    @GetMapping("/dna/{id}")
//    public DnaDto dnaDto (@PathVariable Integer id){
//        Dna dna = dnaService.getDna(id);
//        return DnaMapper.INSTANCE.modelToDto(dna);
//    }
}
