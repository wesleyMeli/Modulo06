package com.digitalhouse.modulo06.aula02.exercicio02.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "LOJAPEDIDO")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class LojaPedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(
			  name = "PEDIDO_PRODUTO", 
			  joinColumns = @JoinColumn(name = "ID_PEDIDO"), 
			  inverseJoinColumns = @JoinColumn(name = "ID_PRODUTO"))
	private List<LojaProduto> produtos;
	
	@Column(name = "VALORTOTAL")
	private double valorTotal;
	
	public LojaPedido() {
	}

	public LojaPedido(Long id, List<LojaProduto> produtos, double valorTotal) {
		this.id = id;
		this.produtos = produtos;
		this.valorTotal = valorTotal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<LojaProduto> getLojaProdutos() {
		return produtos;
	}

	public void setLojaProdutos(List<LojaProduto> produtos) {
		this.produtos = produtos;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
