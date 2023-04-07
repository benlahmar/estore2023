package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Categorie;

public interface ICategorie extends JpaRepository<Categorie, Long>{

}
