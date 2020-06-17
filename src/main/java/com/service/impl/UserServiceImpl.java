package com.service.impl;

import com.bean.User;
import com.dao.UserDao;
import com.service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

	@Resource
	public UserDao dao;
	
	@Override
	public User findUser(Integer id) {
		return dao.findById(id);
	}

	@Override
	public List<User> findListUser() { return dao.findAll(); }

	@Override
	public boolean add(User user) {
		return dao.add(user);
	}

	@Override
	public boolean modify(User user) {
		return dao.update(user);
	}

	@Override
	public boolean remove(Integer id) {
		return dao.delete(id);
	}

}
