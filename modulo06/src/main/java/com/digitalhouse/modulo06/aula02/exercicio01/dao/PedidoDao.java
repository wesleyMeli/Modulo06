package com.digitalhouse.modulo06.aula02.exercicio01.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.digitalhouse.modulo06.aula02.exercicio01.model.Pedido;

@Repository
public interface PedidoDao extends JpaRepository<Pedido, Long>  {

//	@Query(countQuery = "Select SUM(VALORTOTAL) from PEDIDO")
//	double valorTotal();
//	
//	@Query(countQuery = "Select SUM(VALORTOTAL) from PEDIDO WHERE ID_MESA = :id_mesa")
//	double valorTotal(@Param("id") Long id_mesa);
//	
	@Query(countQuery = "DELETE from PEDIDO WHERE ID_MESA = :id", nativeQuery = false)
	void deleteByMesaId(@Param("id") Long id);
	
	@Query(value = "SELECT sum(VALORTOTAL) as total FROM PEDIDO", nativeQuery = true)
    public double countTotalPedido();
	
	@Query(value = "SELECT sum(VALORTOTAL) as total FROM PEDIDO WHERE ID_MESA = :id", nativeQuery = true)
    public double countTotalPedido(Long id);
}
