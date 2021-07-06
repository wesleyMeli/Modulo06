package com.digitalhouse.modulo06.aula02.diploma.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digitalhouse.modulo06.aula02.diploma.model.Diploma;

@Repository
public interface DiplomaDao extends JpaRepository<Diploma, Long>  {

}
