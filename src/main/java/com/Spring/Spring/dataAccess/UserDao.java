package com.Spring.Spring.dataAccess;

import com.Spring.Spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {

    User findById(int id);

    User getByEmail(String email);

}
