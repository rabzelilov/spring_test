package com.rabzelilov.spring_test.rest.models;

import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id",
        scope = DnaDto.class)
public class DnaDto {
    private Integer dnaId;
    private String dnaSequence;
    private Timestamp dnaTimestamp;
}
