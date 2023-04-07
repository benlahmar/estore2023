package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.service.ICustomer;

@RestController
public class CustomerApi {

	@Autowired
	ICustomer service;
	
	@GetMapping("/abc/{v}")
	public String hi(@PathVariable(name = "v") String p)
	{
		return "<h1>hello M. "+p;
	}
	
	@GetMapping("/users")
	public List<User> users()
	{
		return service.alluser();
	}
	
	
	@GetMapping("/users/{id}")
	public User user(@PathVariable long id)
	{
		return service.finduser(id);
	}
}
