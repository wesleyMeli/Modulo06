package com.digitalhouse.modulo06.aula02.exercicio01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.digitalhouse.modulo06.aula02.exercicio01.business.CaixaBusiness;
import com.digitalhouse.modulo06.aula02.exercicio01.business.PedidoBusiness;
import com.digitalhouse.modulo06.aula02.exercicio01.model.Caixa;

@RestController
@RequestMapping("/caixa")
public class CaixaController {
	
	@Autowired
	PedidoBusiness pedidoBusiness;
	
	@Autowired
	CaixaBusiness caixaBusiness;
	
	@GetMapping("/get")
	@ResponseStatus(code = HttpStatus.OK)
	public Caixa get(){
		return caixaBusiness.findById();
	}

	@PostMapping("/close/mesa/{id}")
	public Caixa fecharCaixa(@PathVariable Long id) {
		return caixaBusiness.save(pedidoBusiness.close(id));
		
	}
	@PostMapping("/close/mesa")
	public Caixa fecharTodosCaixa() {
		return caixaBusiness.save(pedidoBusiness.close());
	}
}
