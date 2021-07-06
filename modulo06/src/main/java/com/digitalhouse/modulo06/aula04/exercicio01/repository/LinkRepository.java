package com.digitalhouse.modulo06.aula04.exercicio01.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.digitalhouse.modulo06.aula04.exercicio01.model.Link;

@Repository
public class LinkRepository {

	private Map<Integer, Link> links;
	private int id;
	
	public LinkRepository() {
		this.links = new HashMap<Integer, Link>();
		this.id = 0;
	}
	
	public int save(Link link){
		this.links.put(this.id, link);
		int atual = this.id;
		this.id++;
		return atual;
	}
	
	public int save(Link link, int id){
		this.links.put(id, link);
		return id;
	}
	
	public Link findById(int id) {
		return links.get(id);
	}
	
	public List<Link> findAll() {
		return new ArrayList<>(links.values());
	}
}
