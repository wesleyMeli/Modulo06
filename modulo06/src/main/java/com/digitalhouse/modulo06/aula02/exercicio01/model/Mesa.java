package com.digitalhouse.modulo06.aula02.exercicio01.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "MESA")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Mesa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_MESA")
	@JsonIgnoreProperties("mesa")
	private List<Pedido> pedidos;
	
	@Column(name = "VALORTOTAL")
	private double valorTotal;

	public Mesa() {
		// TODO Auto-generated constructor stub
	}

	public Mesa(Long id, List<Pedido> pedidos, double valorTotal) {
		this.id = id;
		this.pedidos = pedidos;
		this.valorTotal = valorTotal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
