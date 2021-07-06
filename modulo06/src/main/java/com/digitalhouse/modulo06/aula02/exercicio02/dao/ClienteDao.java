package com.digitalhouse.modulo06.aula02.exercicio02.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digitalhouse.modulo06.aula02.exercicio02.model.LojaCliente;

@Repository
public interface ClienteDao extends JpaRepository<LojaCliente, Long>{

}
