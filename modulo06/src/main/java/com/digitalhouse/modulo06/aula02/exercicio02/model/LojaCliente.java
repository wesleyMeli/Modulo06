package com.digitalhouse.modulo06.aula02.exercicio02.model;

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
@Table(name = "LOJACLIENTE")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class LojaCliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nome;
	@Column
	private String cpf;
	@Column
	private String email;
	@Column
	private String telefone;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CLIENTE")
	private List<LojaPedido> pedidos;
	
	public LojaCliente() {
	}

	public LojaCliente(Long id, String nome, String cpf, String email, String telefone, List<LojaPedido> pedidos) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.pedidos = pedidos;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public List<LojaPedido> getLojaPedidos() {
		return pedidos;
	}
	public void setLojaPedidos(List<LojaPedido> pedidos) {
		this.pedidos = pedidos;
	}
	
}
