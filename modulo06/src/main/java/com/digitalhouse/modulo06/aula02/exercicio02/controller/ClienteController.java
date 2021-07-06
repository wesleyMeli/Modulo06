package com.digitalhouse.modulo06.aula02.exercicio02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalhouse.modulo06.aula02.exercicio02.business.ClienteBusiness;
import com.digitalhouse.modulo06.aula02.exercicio02.model.LojaCliente;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	ClienteBusiness clienteBusiness;
	
	@GetMapping("/get/{id}")
	public LojaCliente get(@PathVariable Long id) {
		return clienteBusiness.findById(id); 
	}
	
	@GetMapping("/get")
	public List<LojaCliente> getAll() {
		return clienteBusiness.findAll();
	}
}
