package com.Spring.Spring.dataAccess;

import com.Spring.Spring.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostDao extends JpaRepository<Post,Integer> {

    Post findById(int id);

    List<Post> getByUser_Id(int userId);

}
