package com.digitalhouse.modulo06.aula03.exercicio01.repository;

import java.util.List;

import org.springframework.stereotype.Service;

import com.digitalhouse.modulo06.aula03.exercicio01.dao.StarWarsDao;
import com.digitalhouse.modulo06.aula03.exercicio01.model.StarWars;
import com.digitalhouse.modulo06.repository.GenericRepositoryPersistence;

@Service
public class StarWarsRepository extends GenericRepositoryPersistence<StarWarsDao, StarWars, String>{

	public List<StarWars> findByName(String name) {
		return d.findByName(name);
	}
}
