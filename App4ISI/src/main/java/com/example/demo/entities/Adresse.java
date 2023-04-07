package com.example.demo.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {

	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}
	String rue;
	String ville,pays;
	int codep;
	
	
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public int getCodep() {
		return codep;
	}
	public void setCodep(int codep) {
		this.codep = codep;
	}
	public Adresse(String rue, String ville, String pays, int codep) {
		super();
		this.rue = rue;
		this.ville = ville;
		this.pays = pays;
		this.codep = codep;
	}
	
	
	
}
