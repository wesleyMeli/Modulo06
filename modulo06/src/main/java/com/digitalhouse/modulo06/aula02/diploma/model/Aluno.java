/**
 * author : Wesley F.
 * modulo : 6
 * name : web development with spring - Desenvolvimento web com Spring
 */
package com.digitalhouse.modulo06.aula02.diploma.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "ALUNO")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String name;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ALUNO")
	@JsonIgnoreProperties("aluno")
	private List<Disciplina> disciplinas;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "ID")
	@JsonIgnoreProperties("aluno")
	private Diploma diploma;

	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	
	public Aluno(String name) {
		this.name = name;
	}

	public Aluno(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Diploma getDiploma() {
		return this.diploma;
	}

	public void setDiploma(Diploma diploma) {
		this.diploma = diploma;
	}
}
