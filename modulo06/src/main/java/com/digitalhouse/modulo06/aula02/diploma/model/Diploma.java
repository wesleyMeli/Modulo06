package com.digitalhouse.modulo06.aula02.diploma.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "DIPLOMA")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Diploma {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "average")
	private double media;
	
	@Column()
	private String message;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ALUNO")
	@JsonIgnoreProperties("diploma")
	private Aluno aluno;
	
	public Diploma() {
		// TODO Auto-generated constructor stub
	}

	public Diploma(double media, String message) {
		this.media = media;
		this.message = message;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

}
