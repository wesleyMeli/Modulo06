package com.digitalhouse.modulo06.aula02.diploma.repository;

import org.springframework.stereotype.Service;

import com.digitalhouse.modulo06.aula02.exercicio01.dao.CaixaDao;
import com.digitalhouse.modulo06.aula02.exercicio01.model.Caixa;
import com.digitalhouse.modulo06.repository.GenericRepositoryPersistence;

@Service
public class CaixaRepository extends GenericRepositoryPersistence<CaixaDao, Caixa, Long>{

}
