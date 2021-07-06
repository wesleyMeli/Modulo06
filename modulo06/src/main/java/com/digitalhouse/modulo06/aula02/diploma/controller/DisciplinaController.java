package com.digitalhouse.modulo06.aula02.diploma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.digitalhouse.modulo06.aula02.diploma.business.DisciplinaBusiness;
import com.digitalhouse.modulo06.aula02.diploma.model.Disciplina;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {

	@Autowired
	DisciplinaBusiness disciplinaBusiness;
	
	@GetMapping("/getAll")
	@ResponseStatus(value = HttpStatus.OK)
	public List<Disciplina> getAll() {
		List<Disciplina> as = disciplinaBusiness.findAll();
		return as;
	}
	
	@GetMapping("/get/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public Disciplina get(@PathVariable Long id) {
		return disciplinaBusiness.findById(id);
	}
}

