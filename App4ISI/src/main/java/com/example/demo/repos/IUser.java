package com.example.demo.repos;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.User;

public interface IUser extends JpaRepository<User, Long>{
	
	public User findByLogAndPass(String lg, String pd);
	public List<User> findByDateBetween(LocalDate dd, LocalDate df);
	public List<User> findByLogContainingIgnoreCase(String lg);
	
	public List<User> findByRoleId(long idr);

}
