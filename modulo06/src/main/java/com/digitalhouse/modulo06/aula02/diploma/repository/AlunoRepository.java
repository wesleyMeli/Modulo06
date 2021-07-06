/**
 * author : Wesley F.
 * modulo : 6
 * name : web development with spring - Desenvolvimento web com Spring
 */
package com.digitalhouse.modulo06.aula02.diploma.repository;

import org.springframework.stereotype.Repository;

import com.digitalhouse.modulo06.aula02.diploma.dao.AlunoDao;
import com.digitalhouse.modulo06.aula02.diploma.model.Aluno;
import com.digitalhouse.modulo06.repository.GenericRepositoryPersistence;

@Repository
public class AlunoRepository extends GenericRepositoryPersistence<AlunoDao, Aluno, Long>  {

}
