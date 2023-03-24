package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Role;

public interface IRole extends JpaRepository<Role, Long>{

}
