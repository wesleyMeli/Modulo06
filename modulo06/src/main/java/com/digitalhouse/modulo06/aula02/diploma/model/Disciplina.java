/**
 * author : Wesley F.
 * modulo : 6
 * name : web development with spring - Desenvolvimento web com Spring
 */
package com.digitalhouse.modulo06.aula02.diploma.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "DISCIPLINA")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Disciplina {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name")
	private String nome;
	@Column
	private double nota;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ALUNO")
	@JsonIgnoreProperties("disciplinas")
	private Aluno aluno;
	
	public Disciplina() {
	}

	public Disciplina(String nome, double nota, Aluno aluno) {
		this.nome = nome;
		this.nota = nota;
		this.aluno = aluno;
	}

	public Disciplina(Long id, String nome, double nota, Aluno aluno) {
		this.id = id;
		this.nome = nome;
		this.nota = nota;
		this.aluno = aluno;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
}
