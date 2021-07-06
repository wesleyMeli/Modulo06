package com.digitalhouse.modulo06.aula02.exercicio01.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CAIXA")
public class Caixa {

	@Id
	private Long id;
	@Column
	private Double valor;
	
	public Caixa() {
		this.id = (long) 0;
	}

	public Caixa(Double valor) {
		this.id = (long) 0;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public void setAddValor(Double valor) {
		this.valor += valor;
	}
	
}
