package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Role;
import com.example.demo.entities.User;
import com.example.demo.repos.IRole;
import com.example.demo.repos.IUser;

@Service
public class CustomerManager implements ICustomer{

	@Autowired
	IUser urepo;
	@Autowired
	IRole rrepo;
	
	@Override
	public User inscrire(User u) {
		// TODO Auto-generated method stub
		return urepo.save(u);
	}

	@Override
	public Role addrole(Role r) {
		// TODO Auto-generated method stub
		return rrepo.save(r);
	}

	@Override
	public Role addusert2role(long idu, long idr) {
		Role r=null;
		Optional<Role> or = rrepo.findById(idr);
		Optional<User> uo = urepo.findById(idu);
		if(or.isPresent() && uo.isPresent())
		{
			User u = uo.get();
			 r = or.get();
			u.setRole(r);
			u=urepo.save(u);
		}
		return r;
	}

	@Override
	public User auth(String log, String pas) {
		// TODO Auto-generated method stub
		return urepo.findByLogAndPass(log, pas);
	}

	@Override
	public User updateuser(long idu, User ut) {
		User u=null;
		Optional<User> uo = urepo.findById(idu);
		if(uo.isPresent())
		{
			 u = uo.get();
			u=ut;
			urepo.save(u);
		}
		
		return u;
	}

	@Override
	public List<User> alluser() {
		// TODO Auto-generated method stub
		return urepo.findAll();
	}

	@Override
	public List<User> alluser(long idr) {
		
		return urepo.findByRoleId(idr);
	}

	@Override
	public List<Role> allrole() {
		// TODO Auto-generated method stub
		return rrepo.findAll();
	}

	@Override
	public User inscrire(User u, long idr) {
		Optional<Role> or = rrepo.findById(idr);
		if(or.isPresent())
		{
			Role r = or.get();
			u.setRole(r);
			u=urepo.save(u);			
		}		
		return u;
	}

}
