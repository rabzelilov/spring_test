package com.rabzelilov.spring_test.dal.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@Entity(name = "PassportStrain")
@Table(name = "passport_strain")
@NoArgsConstructor
@EqualsAndHashCode
public class PassportStrain {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "passport_strain_id_seq")
    @SequenceGenerator(
            name = "passport_strain_id_seq",
            sequenceName = "SEQ_PASSPORT_STRAIN",
            allocationSize = 1
    )
    @Column(name = "PASSPORTSTRAIN_ID", nullable = false)
    private Long passportStrainId;

    @Column(name = "PASSPORTSTRAIN_NUMBER", nullable = false)
    private int strainNumber;
    @Column(name = "COLLECTOIN_NAME", nullable = false)
    private String strainCollection;
    @Column(name = "ALLOCATION_DATE", nullable = false)
    private Timestamp allocationDate;
    @Column(name = "EMPLOYEE_NAME")
    private String employeeName;
    @Column(name = "STRAIN_NAME",nullable = false)
    private String strainName;
    @Column(name = "SYNONYMS_NAME")
    private String synonymsName;
    @Column(name = "PURCHASE", nullable = false)
    private boolean purchase;

    @OneToOne(optional = false,mappedBy = "passportStrain")
    private Strain strain;
}
