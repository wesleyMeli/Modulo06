/**
 * author : Wesley F.
 * modulo : 6
 * name : web development with spring - Desenvolvimento web com Spring
 */
package com.digitalhouse.modulo06.aula01.exercicio02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.digitalhouse.modulo06.aula01.exercicio02.business.ProductBusiness;
import com.digitalhouse.modulo06.aula01.exercicio02.model.Product;

@RequestMapping("/product")
@RestController
public class ProductController {

	@Autowired
	ProductBusiness productBusiness;
	
	@GetMapping("/getAll")
	@ResponseStatus(value = HttpStatus.OK)
	public List<Product> getAll() {
		return productBusiness.findAll();
	}
	
	@GetMapping("/getById/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public Product getById(@PathVariable Long id) {
		return productBusiness.findById(id);
	}
	
	@PostMapping("/create")
	@ResponseStatus(value = HttpStatus.OK)
	public Product create(@RequestBody Product product) {
		return productBusiness.save(product);
	}
	
	@PutMapping("/fullUpdate/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public Product fullUpdate(@RequestBody Product product,@PathVariable Long id) {
		return productBusiness.updateFull(product, id);
	}
	
	@PatchMapping("/partialUpdate/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public Product partialUpdate(@RequestBody Product product, @PathVariable Long id) {
		return productBusiness.update(product, id);
	}
	
	@DeleteMapping("/deleteById/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public void deleteById(@PathVariable Long id) {
		productBusiness.deleteById(id);
	}
	
}
