package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Categorie;
import com.example.demo.entities.Produit;

public interface IMetier {

	public Produit addprd(Produit p, long idcat);
	public Categorie addcat(Categorie c);
	public Categorie findcat(long idc);
	public List<Categorie> categories();
	public Categorie categories(long idcat);
	
	List<Produit> allprdcat(long idcat);
	public Produit findPrd(long id);
}
