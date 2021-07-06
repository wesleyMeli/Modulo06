package com.digitalhouse.modulo06.aula04.exercicio01.dto;

import com.digitalhouse.modulo06.aula04.exercicio01.model.Link;

public class LinkDTO {

	private String link;
	
	public LinkDTO(String link) {
		this.link = link;
	}

	public String getLink() {
		return this.link;
	}
	
	public Link transform() {
		return new Link(this.link);
	}
	
	public static LinkDTO transformDTO(Link link) {
		return new LinkDTO(link.getLink());
	}
}