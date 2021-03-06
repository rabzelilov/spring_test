package com.rabzelilov.spring_test.dal.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity(name = "Dna")
@Table(name = "dna")
@NoArgsConstructor
public class Dna {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "dna_id_seq")
    @SequenceGenerator(
        name = "dna_id_seq",
        sequenceName = "SEQ_DNA",
        allocationSize = 1
    )
    @Column(name = "DNA_ID", nullable = false)
    private Long dnaId;
    @Column
    private String dnaSequence;
    @Column
    private Timestamp dnaTimestamp;
}
