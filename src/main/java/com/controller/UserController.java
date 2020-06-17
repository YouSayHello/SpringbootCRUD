package com.controller;

import com.bean.User;
import com.service.UserService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
	
	@Resource
	private UserService us;

	@GetMapping("find/{id}")
	public User findOneUser(@PathVariable Integer id) {
		return us.findUser(id);
	}
	
	@GetMapping("findAll")
	public List<User> findListUser() {
		return us.findListUser();
	}
	
	@PostMapping("add")
	public boolean add(User user) {
		return us.add(user);
	}
	
	@PutMapping("update/{id}")
	public boolean update(@PathVariable Integer id,User user) {
		return us.modify(user);
	}
	
	@GetMapping("delete/{id}")
	public boolean delete(@PathVariable Integer id) {
		return us.remove(id);
	}
}
