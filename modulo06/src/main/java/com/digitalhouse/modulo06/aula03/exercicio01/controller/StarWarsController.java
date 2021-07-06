package com.digitalhouse.modulo06.aula03.exercicio01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalhouse.modulo06.aula03.exercicio01.business.StarWarsBusiness;
import com.digitalhouse.modulo06.aula03.exercicio01.model.StarWars;

@RestController
@RequestMapping("/starWars")
public class StarWarsController {

	@Autowired
	StarWarsBusiness starWarsBusiness;
	
	@GetMapping("/get/{name}")
	public List<StarWars> get(@PathVariable String name) {
		return starWarsBusiness.findById(name);
	}
	
	@GetMapping("/get")
	public List<StarWars> get() {
		return starWarsBusiness.findAll();
	}
}
