package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Categorie;
import com.example.demo.entities.Produit;
import com.example.demo.repos.ICategorie;
import com.example.demo.repos.IProduit;
@Service
public class CatalogueManager  implements IMetier{

	@Autowired
	IProduit prepo;
	@Autowired
	ICategorie crepo;
	
	@Override
	public Produit addprd(Produit p, long idcat) {
		
		Optional<Categorie> co = crepo.findById(idcat);
		if(co.isPresent())
		{
			Categorie c = co.get();
			p.setCategorie(c);
			p=prepo.save(p);
		}
		return p;
	}

	@Override
	public Categorie addcat(Categorie c) {
		// TODO Auto-generated method stub
		return crepo.save(c);
	}

	@Override
	public Categorie findcat(long idc) {
		Categorie c=null;

		Optional<Categorie> co = crepo.findById(idc);
		if(co.isPresent())
		{
			 c = co.get();	
		}
		
		return c;
	}

	@Override
	public List<Categorie> categories() {
		// TODO Auto-generated method stub
		return crepo.findAll();
	}

	@Override
	public Categorie categories(long idcat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> allprdcat(long idcat) {
		// TODO Auto-generated method stub
		return prepo.findByCategorieId(idcat);
	}

	@Override
	public Produit findPrd(long id) {
		
		Optional<Produit> po = prepo.findById(id);
		if(po.isPresent())
			return po.get();
		else
		return null;
	}

}
