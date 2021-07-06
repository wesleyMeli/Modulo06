package com.digitalhouse.modulo06.aula02.diploma.repository;

import org.springframework.stereotype.Repository;

import com.digitalhouse.modulo06.aula02.diploma.dao.DiplomaDao;
import com.digitalhouse.modulo06.aula02.diploma.model.Diploma;
import com.digitalhouse.modulo06.repository.GenericRepositoryPersistence;

@Repository
public class DiplomaRepository extends GenericRepositoryPersistence<DiplomaDao, Diploma, Long>  {


}
