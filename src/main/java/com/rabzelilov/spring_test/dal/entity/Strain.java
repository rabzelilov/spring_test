package com.rabzelilov.spring_test.dal.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity(name = "Strain")
@Table(name = "strain")
@NoArgsConstructor
public class Strain {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "strain_id_seq")
    @SequenceGenerator(
            name = "strain_id_seq",
            sequenceName = "SEQ_STRAIN",
            allocationSize = 1
    )
    @Column(name = "STRAIN_ID", nullable = false)
    private Long id;

    @Column(name = "strain_uid")
    private String strainId;

    @Column(name = "NAME", nullable = false)
    private String strainName;

    @Column(name = "SEQUENCE", nullable = false)
    private String strainSequence;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "PASSPORTSTRAIN_ID")
    private PassportStrain passportStrain;

    @Column(name = "STRAIN_TIMESTAMP")
    private Timestamp strainTimestamp;

    @Column(name = "DNA")
    private String strainDna;
}
