package com.rabzelilov.spring_test.rest.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.rabzelilov.spring_test.dal.entity.Strain;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id",
        scope = PassportStrainDto.class)
public class PassportStrainDto {
    private Long passportStrainId;
    private int strainNumber;
    private String strainCollection;
    private Timestamp allocationDate;
    private String employeeName;
    private String strainName;
    private String synonymsName;
    private boolean purchase;
    private Strain strain;
}
