package com.digitalhouse.modulo06.aula02.diploma.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalhouse.modulo06.aula02.diploma.model.Disciplina;
import com.digitalhouse.modulo06.aula02.diploma.repository.DisciplinaRepository;

@Service
public class DisciplinaBusiness {

	@Autowired
	DisciplinaRepository disciplinaRepository;
	
	public List<Disciplina> findAll() {
		return disciplinaRepository.findAll();
	}
	
	public Disciplina findById(Long id) {
		return disciplinaRepository.findById(id);
	}
	
}
