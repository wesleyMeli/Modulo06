package com.digitalhouse.modulo06.aula04.exercicio01.business;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.digitalhouse.modulo06.aula04.exercicio01.dto.MetricDTO;
import com.digitalhouse.modulo06.aula04.exercicio01.model.Link;
import com.digitalhouse.modulo06.aula04.exercicio01.repository.LinkRepository;

@Service
public class LinkBusiness {

	@Autowired
	LinkRepository linkRepository;
	
	private Link findLinkById(int id) {
		Link link = linkRepository.findById(id);
		if(link == null || link.isStatus()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum link valido encontrado com esse ID");
		return link;
	}
	
	public ResponseEntity<Void> findById(int id) {
		Link link = findLinkById(id);
		link.setNumberRedirect();
		linkRepository.save(link,id);
		return createRedirect(link.getLink());
	}
	
	private ResponseEntity<Void> createRedirect(String link) {
		return ResponseEntity.status(HttpStatus.FOUND)
        .location(URI.create(link))
        .build();
	}
	
	public MetricDTO findMetricById(int id) {
		return MetricDTO.transformDTO(findLinkById(id));
	}
	
	public void invalid(int id) {
		Link link = findLinkById(id);
		link.setStatus(true);
		linkRepository.save(link,id);
	}
	
	public List<Link> findAll() {
		return linkRepository.findAll();
	}
	
	public int save(Link link) {
		try {
			urlValidate(link.getLink());
			return linkRepository.save(link);
		} catch (IOException e) {
			throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED ,"Falha ao verificar o link informado");
		}
	}
	
	private void urlValidate(String link) throws IOException {
		URL url = new URL(link);
		HttpURLConnection huc = (HttpURLConnection) url.openConnection();
		huc.setRequestMethod("GET");
        huc.connect();
        if(huc.getResponseCode() != 200) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Link informado invalidp");
	}
}
