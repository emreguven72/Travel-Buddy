package com.Spring.Spring.services;

import com.Spring.Spring.entities.Post;

import java.util.List;

public interface PostService {

    List<Post> getAll();

    Post getById(int id);

    List<Post> getByUserId(int userId);

    String add(Post post);

}
