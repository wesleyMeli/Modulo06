/**
 * author : Wesley F.
 * modulo : 6
 * name : web development with spring - Desenvolvimento web com Spring
 */
package com.digitalhouse.modulo06.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public abstract class GenericRepositoryPersistence <D extends JpaRepository<T, U>, T, U >{

	@Autowired
    public D d;
	
	public T findById(U u) {
    	return (T) d.getById(u);
    }

    public List<T> findAll() {
        return d.findAll();
    }
    
    public T save(T t) {
    	return d.save(t);
    }
    
    public List<T> saveAll(List<T> t) {
    	return d.saveAll(t);
    }

    public void deleteById(U u) {
    	d.deleteById(u);
    }
	
    public void deleteByList(List<T> t) {
    	d.deleteAll(t);
    }
    
    public void deleteAll() {
    	d.deleteAll();
    }
}
