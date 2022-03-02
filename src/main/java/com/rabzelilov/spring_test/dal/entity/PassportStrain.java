package com.rabzelilov.spring_test.dal.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity(name = "PassportStrain")
@Table(name = "passport_strain")
@NoArgsConstructor
public class PassportStrain {
}
