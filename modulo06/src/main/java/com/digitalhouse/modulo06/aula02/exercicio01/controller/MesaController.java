package com.digitalhouse.modulo06.aula02.exercicio01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalhouse.modulo06.aula02.exercicio01.business.MesaBusiness;
import com.digitalhouse.modulo06.aula02.exercicio01.model.Mesa;

@RestController
@RequestMapping("/mesa")
public class MesaController {

	@Autowired
	MesaBusiness mesaBusiness;
	
	@RequestMapping("/getAll")
	public List<Mesa> getAll(){
		return mesaBusiness.findAll();
	}
}
