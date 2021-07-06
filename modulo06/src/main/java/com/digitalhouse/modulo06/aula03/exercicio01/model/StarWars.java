package com.digitalhouse.modulo06.aula03.exercicio01.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STARWARS")
public class StarWars {
	
	@Id
	private String name;
	@Column
    private String height;
	@Column
    private String mass;
	
	@Column(name = "hair_color")
    private String hairColor;
	
	@Column(name = "skin_color")
    private String skinColor;
	
	@Column(name = "eye_color")
    private String eyeColor;
	
	@Column(name = "birth_year")
    private String birthYear;
	
	@Column
    private String gender;
	@Column
    private String homeworld;
	@Column
    private String species;

    public StarWars() {
		// TODO Auto-generated constructor stub
	}

	public StarWars(String name, String height, String mass, String hairColor, String skinColor, String eyeColor,
			String birthYear, String gender, String homeworld, String species) {
		
		this.name = name;
		this.height = height;
		this.mass = mass;
		this.hairColor = hairColor;
		this.skinColor = skinColor;
		this.eyeColor = eyeColor;
		this.birthYear = birthYear;
		this.gender = gender;
		this.homeworld = homeworld;
		this.species = species;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getMass() {
		return mass;
	}

	public void setMass(String mass) {
		this.mass = mass;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public String getSkinColor() {
		return skinColor;
	}

	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHomeworld() {
		return homeworld;
	}

	public void setHomeworld(String homeworld) {
		this.homeworld = homeworld;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}	
	
}
