package com.digitalhouse.modulo06.aula02.exercicio01.repository;

import org.springframework.stereotype.Service;

import com.digitalhouse.modulo06.aula02.exercicio01.dao.MesaDao;
import com.digitalhouse.modulo06.aula02.exercicio01.model.Mesa;
import com.digitalhouse.modulo06.repository.GenericRepositoryPersistence;

@Service
public class MesaRepository extends GenericRepositoryPersistence<MesaDao, Mesa, Long>{

}
