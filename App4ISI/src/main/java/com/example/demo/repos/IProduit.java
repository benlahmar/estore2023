package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Produit;

public interface IProduit extends JpaRepository<Produit, Long>{

	public List<Produit> findByQteLessThan(int seuil);
	public List<Produit> findByPriceBetween(double min, double max);
	public List<Produit> findByDesgContaining(String key);
	
	public List<Produit> findByCategorieId(long idc);

}
