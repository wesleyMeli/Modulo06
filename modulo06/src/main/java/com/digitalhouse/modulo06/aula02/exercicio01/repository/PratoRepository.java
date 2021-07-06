package com.digitalhouse.modulo06.aula02.exercicio01.repository;

import org.springframework.stereotype.Service;

import com.digitalhouse.modulo06.aula02.exercicio01.dao.PratoDao;
import com.digitalhouse.modulo06.aula02.exercicio01.model.Prato;
import com.digitalhouse.modulo06.repository.GenericRepositoryPersistence;

@Service
public class PratoRepository extends GenericRepositoryPersistence<PratoDao, Prato, Long>  {

}
