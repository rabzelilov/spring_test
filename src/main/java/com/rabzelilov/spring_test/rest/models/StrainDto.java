package com.rabzelilov.spring_test.rest.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.rabzelilov.spring_test.dal.entity.PassportStrain;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@NoArgsConstructor
@Getter
@Setter
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id",
        scope = StrainDto.class)
public class StrainDto {
    private Long id;
    private String strainName;
    private String strainSequence;
    private Long passportStrainId;
    private Timestamp strainTimestamp;
    private String strainDna;
}
