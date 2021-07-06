package com.digitalhouse.modulo06.aula02.exercicio01.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "PRATO")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Prato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private double preco;
	@Column
	private String descricao;
	@Column
	private int quantidade;
	
	public Prato() {
		// TODO Auto-generated constructor stub
	}

	public Prato(Long id, double preco, String descricao, int quantidade) {
		super();
		this.id = id;
		this.preco = preco;
		this.descricao = descricao;
		this.quantidade = quantidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
