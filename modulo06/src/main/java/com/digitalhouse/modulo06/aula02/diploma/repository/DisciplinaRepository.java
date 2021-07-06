package com.digitalhouse.modulo06.aula02.diploma.repository;

import org.springframework.stereotype.Repository;

import com.digitalhouse.modulo06.aula02.diploma.dao.DisciplinaDao;
import com.digitalhouse.modulo06.aula02.diploma.model.Disciplina;
import com.digitalhouse.modulo06.repository.GenericRepositoryPersistence;

@Repository
public class DisciplinaRepository extends GenericRepositoryPersistence<DisciplinaDao, Disciplina, Long>  {

}
