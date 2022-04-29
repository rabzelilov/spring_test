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

    @Column(name = "consortium")
    private boolean consortium;

    @Column(name = "collection_name")
    private  String nameCollection;

    @Column(name = "species_synonyms")
    private String speciesSynonyms;

    @Column(name = "genus")
    private String genus;

    @Column(name = "family")
    private String family;

    @Column(name = "phylum")
    private String phylum;

    @Column(name = "isolation_source")
    private String isolationSource;

//    @Column(name = "host")
//    private String host;

    @Column(name = "geographical_coordinates")
    private String geographicalCoordinates;

    @Column(name = "geographical_origin")
    private String geographicalOrigin;
//
    @Column(name = "genetical_marker")
    private String geneticalMarker;

    @Column(name = "pathogenicity_group")
    private String pathogenicityGroup;
//
    @Column(name = "availability")
    private EAvailability eAvailability;

    @Column(name = "type_strain")
    private String typeStrain;

    @Column(name = "application_areas")
    private String applicationAreas;

    @Column(name = "publication_1")
    private String publication1;

    @Column(name = "publication_2")
    private String publication2;


//    @Column(name = "PASSPORTSTRAIN_NUMBER", nullable = false)
//    private int strainNumber;
//    @Column(name = "COLLECTOIN_NAME", nullable = false)
//    private String strainCollection;
//    @Column(name = "ALLOCATION_DATE", nullable = false)
//    private Timestamp allocationDate;
//    @Column(name = "EMPLOYEE_NAME")
//    private String employeeName;
    @Column(name = "STRAIN_NAME",nullable = false)
    private String strainName;
//    @Column(name = "SYNONYMS_NAME")
//    private String synonymsName;
//    @Column(name = "PURCHASE", nullable = false)
//    private boolean purchase;

    @OneToOne(optional = false,mappedBy = "passportStrain")
    private Strain strain;
}
