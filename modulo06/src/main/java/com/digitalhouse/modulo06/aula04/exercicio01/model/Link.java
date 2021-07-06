package com.digitalhouse.modulo06.aula04.exercicio01.model;

public class Link {

	private String link;
	private boolean status;
	private int numberRedirect;
	
	public Link() {
		this.numberRedirect = 0;
	}
	
	public Link(String link) {
		super();
		this.link = link;
	}
	
	public Link(String link, boolean status, int numberRedirect) {
		this.link = link;
		this.status = status;
		this.numberRedirect = numberRedirect;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getNumberRedirect() {
		return this.numberRedirect;
	}
	public void setNumberRedirect() {
		this.numberRedirect++;
	}
	
	
}
