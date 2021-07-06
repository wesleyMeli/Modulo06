/**
 * author : Wesley F.
 * modulo : 6
 * name : web development with spring - Desenvolvimento web com Spring
 */
package com.digitalhouse.modulo06.aula01.exercicio02.business;
import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import com.digitalhouse.modulo06.aula01.exercicio02.model.Product;
import com.digitalhouse.modulo06.aula01.exercicio02.repository.ProductRepository;

@Component
public class ProductBusiness {
	
	@Autowired
	private ProductRepository productRepositor;
	
	public List<Product> findAll() {
		return productRepositor.findAll();
	}

	public Product findById(Long u) {
		return (Product) Hibernate.unproxy(productRepositor.findById(u));
	}
	
	public Product save(Product t) {
		return productRepositor.save(t);
	}
	
	public Product updateFull(Product t, Long id) {
		Product product = findById(t.getId());
		if( product != null ) return productRepositor.save(t);
		throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE);
	}
		
	public Product update(Product t, Long id) {
		Product prod = findById(id);
		if(t.getName() != null) prod.setName(t.getName()); 
		if(t.getPrice() != 0) prod.setPrice(prod.getPrice());
		return save(prod);	
	}
	
	public void deleteById(Long u) {
		try {
			productRepositor.deleteById(u);
		} catch (EmptyResultDataAccessException e) {
			throw new ResponseStatusException(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED);
		}
	}
	
	
}
