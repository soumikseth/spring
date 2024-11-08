package com.boot.spring.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;
@RestController
public class UserController {
	@Autowired
	private UserService serv;
	@GetMapping("/users")
	public List<User>findall()
	{
		return serv.findbur();
		
	}
	@GetMapping("/users/{id}")
	public User findbyid(@PathVariable long id)
	{
		return serv.findbylund(id);
		
	}
	@PostMapping("/use")
	public void save(@RequestBody User user)
	{
		serv.save(user);
	}
	@PutMapping("/user/{id}")
	public boolean updates(@RequestBody User user,@PathVariable long id)
	{
		return serv.update(user, id);
	}
	@DeleteMapping("/user")
	public String delete(@RequestBody long  id)
	{
		return serv.deletebyid(id);
		
	}
	
}
