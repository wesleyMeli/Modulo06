package com.digitalhouse.modulo06.aula03.exercicio01.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.digitalhouse.modulo06.aula03.exercicio01.model.StarWars;

@Repository
public interface StarWarsDao extends JpaRepository<StarWars, String>{

	@Query(value = "SELECT * FROM STARWARS WHERE name like %:name%", nativeQuery = true)
	public List<StarWars> findByName(String name);
}
