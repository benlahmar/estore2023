package com.example.demo.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {

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
	
	
	
}
