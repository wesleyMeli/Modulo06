package com.digitalhouse.modulo06.aula02.diploma.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalhouse.modulo06.aula02.diploma.model.Diploma;
import com.digitalhouse.modulo06.aula02.diploma.repository.DiplomaRepository;

@Service
public class DiplomaBusiness {

	@Autowired
	DiplomaRepository diplomaRepository;
	
	public List<Diploma> findAll() {
		return diplomaRepository.findAll();
	}
	
	public Diploma findById(Long id) {
		return diplomaRepository.findById(id);
	}
	
}
