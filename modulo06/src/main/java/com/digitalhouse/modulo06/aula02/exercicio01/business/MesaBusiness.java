package com.digitalhouse.modulo06.aula02.exercicio01.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalhouse.modulo06.aula02.exercicio01.model.Mesa;
import com.digitalhouse.modulo06.aula02.exercicio01.repository.MesaRepository;

@Service
public class MesaBusiness {

	@Autowired
	MesaRepository mesaRepository;
	
	public List<Mesa> findAll() {
		return mesaRepository.findAll();
	}
	
	public Mesa findById(Long id) {
		return mesaRepository.findById(id);
	}
	
}
