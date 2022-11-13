package com.Spring.Spring.services;

import com.Spring.Spring.dataAccess.UserDao;
import com.Spring.Spring.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Random;

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
	public void add(User user) {
		byte[] array = new byte[20]; // length is bounded by 7
		new Random().nextBytes(array);
		String token = new String(array, Charset.forName("UTF-8"));
		user.setToken(token);
		this.userDao.save(user);
	}

	@Override
	public User getById(int id) {
		return this.userDao.findById(id);
	}

	@Override
	public String deleteById(int id) {
		User user = getById(id);
		this.userDao.delete(user);
		return "You have successfully delete a user";
	}

	@Override
	public User getByEmail(String email) {
		return this.userDao.getByEmail(email);
	}

}
