package com.example.demo;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Role;
import com.example.demo.entities.User;
import com.example.demo.repos.IRole;
import com.example.demo.repos.IUser;
import com.example.demo.service.ICustomer;


@SpringBootApplication
public class App4IsiApplication implements CommandLineRunner{

	
	@Autowired
	ICustomer service;
	
	public static void main(String[] args) {
		SpringApplication.run(App4IsiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
	  service.alluser(5L);
	}

	
}
