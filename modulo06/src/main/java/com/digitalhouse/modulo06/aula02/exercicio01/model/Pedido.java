package com.digitalhouse.modulo06.aula02.exercicio01.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "PEDIDO")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_MESA")
	@JsonIgnoreProperties("pedidos")
	private Mesa mesa;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			  name = "PEDIDO_PRATO", 
			  joinColumns = @JoinColumn(name = "ID_PEDIDO"), 
			  inverseJoinColumns = @JoinColumn(name = "ID_PRATO"))
	private List<Prato> pratos;
	
	@Column(name = "VALORTOTAL")
	private double valorTotal;

	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public Pedido(Long id, Mesa mesa, List<Prato> pratos, double valorTotal) {
		super();
		this.id = id;
		this.mesa = mesa;
		this.pratos = pratos;
		this.valorTotal = valorTotal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public List<Prato> getPratos() {
		return pratos;
	}

	public void setPratos(List<Prato> pratos) {
		this.pratos = pratos;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
