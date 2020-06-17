package com.service;

import com.bean.User;
import java.util.List;

public interface UserService {
	
	public User findUser(Integer id);

	public List<User> findListUser();

	public boolean add(User user);

	public boolean modify(User user);

	public boolean remove(Integer id);
}
