package com.digitalhouse.modulo06.aula02.exercicio01.repository;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.digitalhouse.modulo06.aula02.exercicio01.dao.PedidoDao;
import com.digitalhouse.modulo06.aula02.exercicio01.model.Pedido;
import com.digitalhouse.modulo06.repository.GenericRepositoryPersistence;

@Service
public class PedidoRepository extends GenericRepositoryPersistence<PedidoDao, Pedido, Long>  {

	@Transactional
	public void deleteByMesaId(Long id) {
		d.deleteByMesaId(id);
	}
	
    public double countTotalPedido() {
    	return d.countTotalPedido();
    }
	
    public double countTotalPedido(Long id) {
    	return d.countTotalPedido(id);
    }
	
}
