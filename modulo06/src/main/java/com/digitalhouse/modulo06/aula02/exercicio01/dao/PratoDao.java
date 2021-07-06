package com.digitalhouse.modulo06.aula02.exercicio01.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digitalhouse.modulo06.aula02.exercicio01.model.Prato;

@Repository
public interface PratoDao extends JpaRepository<Prato, Long> {

}
