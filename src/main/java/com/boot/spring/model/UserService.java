package com.boot.spring.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	public List<User> findbur()
	{
		return repo.findAll();
	}
	public User findbylund(long id)
	{
		User users=repo.findById(id).get();
		return users;
	}
	public void save(User user)
	{
		repo.save(user);
		
	}
	public boolean update(User user ,long id)
	{
		User users=repo.findById(id).get();
		users.setName(user.getName());
		users.setEmail(user.getEmail());
		repo.save(users);
		return true;	
	}
	public  String deletebyid(long id)
	{
		repo.deleteById(id);
		return "succesfullydeleted";
		
		
	}

	
	
	
	
	
}
