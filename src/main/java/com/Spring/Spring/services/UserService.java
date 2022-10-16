package com.Spring.Spring.services;

import com.Spring.Spring.entities.User;
import java.util.List;

public interface UserService {

	List<User> getAll();

	String add(User user);

	User getById(int id);

	String deleteById(int id);
	
}
