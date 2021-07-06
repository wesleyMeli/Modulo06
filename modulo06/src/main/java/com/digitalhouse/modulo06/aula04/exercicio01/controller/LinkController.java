package com.digitalhouse.modulo06.aula04.exercicio01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;	
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.digitalhouse.modulo06.aula04.exercicio01.business.LinkBusiness;
import com.digitalhouse.modulo06.aula04.exercicio01.dto.MetricDTO;
import com.digitalhouse.modulo06.aula04.exercicio01.model.Link;

@RestController
public class LinkController {

	@Autowired
	LinkBusiness linkBusiness;
	
	@GetMapping("/link/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public ResponseEntity<Void>  get(@PathVariable int id) {
		return linkBusiness.findById(id);
		
	}
	
	@GetMapping("/metrics/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public MetricDTO getMetrics(@PathVariable int id) {
		return linkBusiness.findMetricById(id);
	}
	
	@PostMapping("/link")
	@ResponseStatus(code = HttpStatus.OK)
	public int post(@RequestBody Link link) {
		return linkBusiness.save(link);
	}
	
	@PostMapping("/invalidate/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void postInvalid(@PathVariable int id) {
		linkBusiness.invalid(id);
	}
	
	@GetMapping("/link")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Link> getAll() {
		return linkBusiness.findAll();
	}
}
