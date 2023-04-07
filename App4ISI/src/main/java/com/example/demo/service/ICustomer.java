package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Profile;
import com.example.demo.entities.Role;
import com.example.demo.entities.User;

public interface ICustomer {

	public User inscrire(User u);
	public User inscrire(User u, long idr);
	public Role addrole(Role r);
	
	public User finduser(long id);
	public Role addusert2role(long idu, long idr);
	public User auth(String log,String pas);
	public User updateuser(long idu, User ut);
	
	public List<User> alluser();
	public List<User> alluser(long idr);
	public List<Role> allrole();
	
	public Profile addprofile(Profile p, long idu);
	
}
