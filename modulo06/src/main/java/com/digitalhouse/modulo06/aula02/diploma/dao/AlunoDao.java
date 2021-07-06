package com.digitalhouse.modulo06.aula02.diploma.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digitalhouse.modulo06.aula02.diploma.model.Aluno;

@Repository
public interface AlunoDao extends JpaRepository<Aluno, Long> {

}
