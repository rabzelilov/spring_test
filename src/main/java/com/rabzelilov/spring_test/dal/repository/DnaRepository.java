package com.rabzelilov.spring_test.dal.repository;

import com.rabzelilov.spring_test.dal.entity.Dna;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DnaRepository extends JpaRepository<Dna,Long> {
}
