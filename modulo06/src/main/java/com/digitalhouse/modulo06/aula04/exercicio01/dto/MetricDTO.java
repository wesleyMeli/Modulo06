package com.digitalhouse.modulo06.aula04.exercicio01.dto;

import com.digitalhouse.modulo06.aula04.exercicio01.model.Link;

public class MetricDTO {
	
	private String link;
	private int metric;
	
	public MetricDTO(Link link) {
		this.link = link.getLink();
		this.metric = link.getNumberRedirect();
	}

	public String getLink() {
		return this.link;
	}
	
	public int getMetric() {
		return this.metric;
	}

	public Link transform() {
		return new Link(this.link);
	}
	
	public static MetricDTO transformDTO(Link link) {
		return new MetricDTO(link);
	}
}
