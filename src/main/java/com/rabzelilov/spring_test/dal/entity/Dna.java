package com.rabzelilov.spring_test.dal.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Getter
@Setter
@Entity(name = "Dna")
@Table(name = "dna")
@NoArgsConstructor
public class Dna {
    @Id
    @SequenceGenerator(
        name = "dna_dna_id_seq",
        sequenceName = "dna_dna_id_seq",
        allocationSize = 1
    )
    private Integer dnaId;
}
