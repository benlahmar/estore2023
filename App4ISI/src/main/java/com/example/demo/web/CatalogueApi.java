package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Categorie;
import com.example.demo.service.IMetier;
@RestController
public class CatalogueApi {

	@Autowired
	IMetier service;
	
	@GetMapping("/categories")
	public List<Categorie> all()
	{
		return service.categories();
	}
	
	@GetMapping("/categories/{id}")
	public Categorie findcat(@PathVariable long id)
	{
		return service.findcat(id);
	}
	
	@PostMapping("/categories")
	public Categorie savecat(@RequestBody Categorie c)
	{
		return service.addcat(c);
	}
}
