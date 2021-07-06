package com.digitalhouse.modulo06.aula02.diploma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.digitalhouse.modulo06.aula02.diploma.business.AlunoBusiness;
import com.digitalhouse.modulo06.aula02.diploma.model.Aluno;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

	@Autowired
	AlunoBusiness alunoBusiness;
	
	@GetMapping("/getAll")
	@ResponseStatus(value = HttpStatus.OK)
	public List<Aluno> getAll() {
		return alunoBusiness.findAll();
	}
	
	@GetMapping("/get/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public Aluno get(@PathVariable Long id) {
		return alunoBusiness.findById(id);
	}
	
	@PostMapping("/post")
	@ResponseStatus(value = HttpStatus.OK)
	public Aluno post(@RequestBody Aluno aluno) {
		return alunoBusiness.save(aluno);
	}
}
