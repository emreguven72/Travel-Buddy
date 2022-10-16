package com.Spring.Spring.services;

import com.Spring.Spring.dataAccess.PostDao;
import com.Spring.Spring.entities.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostManager implements PostService{
    private PostDao postDao;

    @Autowired
    public PostManager(PostDao postDao) {
        this.postDao = postDao;
    }

    @Override
    public List<Post> getAll() {
        return this.postDao.findAll();
    }

    @Override
    public Post getById(int id) {
        return this.postDao.findById(id);
    }

    @Override
    public List<Post> getByUserId(int userId) {
        return this.postDao.getByUser_Id(userId);
    }

    @Override
    public String add(Post post) {
        this.postDao.save(post);
        return "You have successfully created a Post";
    }
}
