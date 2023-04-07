package com.example.demo;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Adresse;
import com.example.demo.entities.Profile;
import com.example.demo.entities.Role;
import com.example.demo.entities.User;
import com.example.demo.repos.IProfile;
import com.example.demo.repos.IRole;
import com.example.demo.repos.IUser;
import com.example.demo.service.ICustomer;


@SpringBootApplication
public class App4IsiApplication implements CommandLineRunner{

	
//	@Autowired
//	ICustomer service;
//	
//	@Autowired
//	IProfile prepo;
//	@Autowired
//	IUser urepo;
	
	public static void main(String[] args) {
		SpringApplication.run(App4IsiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		User u =new User("toi02", "toi22", LocalDate.now());
//		
//		String[] prenoms= {"pp1","pp2"};
//		Profile p =new Profile("nom02", prenoms, LocalDate.now(), "email", "photo");
//		Adresse add=new Adresse("rue", "ville", "pays", 10000);
//		p.setAddresse(add);
//		
//		u.setProfile(p);
//		urepo.save(u);
		//prepo.save(p);
		
//		Profile p1 = prepo.findById(13L).get();
//		User u1 = urepo.findById(15L).get();
//		System.out.println( u1.getProfile().getNom());
//		u1.setProfile(p1);
//		p1.setUser(u1);
		
//		urepo.save(u1);
//		prepo.save(p1);
	  
	}

	
}
