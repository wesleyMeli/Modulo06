package com.digitalhouse.modulo06.aula02.exercicio02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "LOJAPRODUTO")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class LojaProduto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String descricao;
	@Column
	private String cor;
	@Column
	private int quatidade;
	@Column
	private double preco;

	public LojaProduto() {
		// TODO Auto-generated constructor stub
	}

	public LojaProduto(Long id, String descricao, String cor, int quatidade, double preco) {
		this.id = id;
		this.descricao = descricao;
		this.cor = cor;
		this.quatidade = quatidade;
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQuatidade() {
		return this.quatidade;
	}

	public void setQuatidade(int quatidade) {
		this.quatidade = quatidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
