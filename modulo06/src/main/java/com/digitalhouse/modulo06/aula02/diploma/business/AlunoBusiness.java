package com.digitalhouse.modulo06.aula02.diploma.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalhouse.modulo06.aula02.diploma.model.Aluno;
import com.digitalhouse.modulo06.aula02.diploma.model.Diploma;
import com.digitalhouse.modulo06.aula02.diploma.model.Disciplina;
import com.digitalhouse.modulo06.aula02.diploma.repository.AlunoRepository;

@Service
public class AlunoBusiness {
	
	private static final String APROVADO =  "Aluno aprovado, nota ascima da media";
	private static final String REPROVADO =  "Aluno reprovado, nota abaixo da media";
	private static final String PARABENS =  "Aluno aprovado, PARABENS - nota ascima de 9";

	@Autowired
	AlunoRepository alunoRepository;
	
	public List<Aluno> findAll() {
		return alunoRepository.findAll();
	}
	
	public Aluno findById(Long id) {
		return alunoRepository.findById(id);
	}
	
	public Aluno save(Aluno aluno) {
		aluno.setDiploma(getDiploma(aluno.getDisciplinas()));
		return alunoRepository.save(aluno);
		
	}
	
	private Diploma getDiploma(List<Disciplina> disciplinas) {
		double value = getMedia(disciplinas);
		return new Diploma(value, getMessage(value));
	}

	private String getMessage(double media) {
		if(media > 9) return PARABENS;
		if(media > 6) return APROVADO;
		return REPROVADO;
	}
	
	private double getMedia(List<Disciplina> disciplinas) {
		double value = 0;
		for(Disciplina d : disciplinas) {
			value += d.getNota();
		}
		return value/disciplinas.size();
	}
}
