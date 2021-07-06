package com.digitalhouse.modulo06.aula02.exercicio02.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalhouse.modulo06.aula02.exercicio02.model.LojaCliente;
import com.digitalhouse.modulo06.aula02.exercicio02.repository.ClienteRepoitory;

@Service
public class ClienteBusiness {

	@Autowired
	ClienteRepoitory clienteRepoitory;
	
	public LojaCliente findById(Long id) {
		return clienteRepoitory.findById(id);
	}
	
	public List<LojaCliente> findAll() {
		return clienteRepoitory.findAll();
	}
	
}
