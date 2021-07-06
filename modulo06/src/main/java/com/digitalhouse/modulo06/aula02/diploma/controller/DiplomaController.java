package com.digitalhouse.modulo06.aula02.diploma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.digitalhouse.modulo06.aula02.diploma.business.DiplomaBusiness;
import com.digitalhouse.modulo06.aula02.diploma.model.Diploma;

@RestController
@RequestMapping("diploma")
public class DiplomaController {

	@Autowired
	DiplomaBusiness diplomaBusiness;
	
	@GetMapping("/getAll")
	@ResponseStatus(value = HttpStatus.OK)
	public List<Diploma> getAll() {
		return diplomaBusiness.findAll();
	}
	
	@GetMapping("/get/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public Diploma get(@PathVariable Long id) {
		return diplomaBusiness.findById(id);
	}
	
}
