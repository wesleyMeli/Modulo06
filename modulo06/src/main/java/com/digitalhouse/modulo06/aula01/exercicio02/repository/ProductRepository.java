/**
 * author : Wesley F.
 * modulo : 6
 * name : web development with spring - Desenvolvimento web com Spring
 */
package com.digitalhouse.modulo06.aula01.exercicio02.repository;

import org.springframework.stereotype.Service;

import com.digitalhouse.modulo06.aula01.exercicio02.model.Product;
import com.digitalhouse.modulo06.repository.GenericRepositoryPersistence;
import com.digitalhouse.modulo06.aula01.exercicio02.dao.ProductDao;

@Service
public class ProductRepository extends GenericRepositoryPersistence<ProductDao, Product, Long> {

}
