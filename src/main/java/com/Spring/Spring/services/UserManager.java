package com.Spring.Spring.services;

import com.Spring.Spring.dataAccess.UserDao;
import com.Spring.Spring.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserManager implements UserService {
	
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public List<User> getAll() {
		return this.userDao.findAll();
	}

	@Override
	public String add(User user) {
		this.userDao.save(user);
		return "You have successfully create a user";
	}

}
