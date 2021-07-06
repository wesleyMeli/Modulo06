package com.digitalhouse.modulo06.aula03.exercicio01.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalhouse.modulo06.aula03.exercicio01.model.StarWars;
import com.digitalhouse.modulo06.aula03.exercicio01.repository.StarWarsRepository;

@Service
public class StarWarsBusiness {

	@Autowired
	StarWarsRepository starWarsRepository;
	
	public List<StarWars> findById(String name) {
		return starWarsRepository.findByName(name);
	}
	
	public List<StarWars> findAll() {
		return starWarsRepository.findAll();
	}
}
