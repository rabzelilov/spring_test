package com.rabzelilov.spring_test.rest.controllers;

import com.rabzelilov.spring_test.dal.entity.Strain;
import com.rabzelilov.spring_test.rest.models.StrainDto;
import com.rabzelilov.spring_test.service.StrainService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/strain")
@RequiredArgsConstructor
public class StrainController {

    private final StrainService strainService;

    @GetMapping("/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public StrainDto getStrainById(@PathVariable Long id){
        return strainService.getStrainById(id);
    }
//
//    @GetMapping("/{strainName}")
//    @PreAuthorize("hasRole('MODERATOR')")
//    public StrainDto getStrainByName(@PathVariable String strainName){
//        return strainService.getStrainByName(strainName);
//    }

    @PostMapping("/set")
    @PreAuthorize("hasRole('MODERATOR')")
    public StrainDto setStrain(@RequestBody StrainDto strainDto){
        return strainService.save(strainDto);
    }

    @PutMapping("/update/{id}")
    public StrainDto updStrain(@PathVariable Long id, @RequestBody StrainDto strainDto){
        return strainService.save(strainDto);
    }

    @DeleteMapping("/del/{id}")
    public void delStrain(@PathVariable Long id){
        strainService.remove(id);
    }
}
