package com.digitalhouse.modulo06.aula02.exercicio01.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.digitalhouse.modulo06.aula02.diploma.repository.CaixaRepository;
import com.digitalhouse.modulo06.aula02.exercicio01.model.Caixa;

@Service
public class CaixaBusiness {

	@Autowired
	CaixaRepository caixaRepository;
	
	public Caixa save(double value) {

		try {
			Caixa caixa = verifyBD();
			caixa.setAddValor(value);
			return caixaRepository.save(caixa);
		} catch (ResponseStatusException e) {
			return caixaRepository.save(new Caixa(value));
		}
	}
	
	private Caixa verifyBD() {
		List<Caixa> caixa = caixaRepository.findAll();
		if(caixa.isEmpty()) throw new ResponseStatusException(HttpStatus.NO_CONTENT, "nenhum caixa encontrado");
		return caixa.get(0);
	}
	
	public Caixa findById(){
		return verifyBD();
	}

}
