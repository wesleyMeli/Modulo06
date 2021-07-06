package com.digitalhouse.modulo06.aula02.exercicio01.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalhouse.modulo06.aula02.exercicio01.repository.PedidoRepository;

@Service
public class PedidoBusiness {

	@Autowired
	PedidoRepository pedidoRepository;
	
	public double close(Long id) {
		double value = pedidoRepository.countTotalPedido(id);
		deleteByMesaId(id);
		return value;
	}
	
	public double close() {
		double value = pedidoRepository.countTotalPedido();
		deleteAll();
		return value;
	}
	
	public void deleteById(Long id) {
		pedidoRepository.deleteById(id);
	}
	
	public void deleteByMesaId(Long id) {
		pedidoRepository.deleteByMesaId(id);
	}
	
	public void deleteAll() {
		pedidoRepository.deleteAll();
	}
	
}
