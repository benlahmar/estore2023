package com.example.demo.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "userdetails")
public class Profile {

	@Id
	@GeneratedValue
	long num;
	@Column(name = "name")
	String nom;
	
	@ElementCollection
	@OrderColumn
	String[] prenoms;
	
	LocalDate date;
	String email;
	String photo;
	
	@Embedded
	Adresse addresse;

	@OneToOne()
	User user;
	

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String[] getPrenoms() {
		return prenoms;
	}

	public void setPrenoms(String[] prenoms) {
		this.prenoms = prenoms;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Adresse getAddresse() {
		return addresse;
	}

	public void setAddresse(Adresse addresse) {
		this.addresse = addresse;
	}
	
	
	
	
}
