package com.Spring.Spring.api;

import com.Spring.Spring.entities.Post;
import com.Spring.Spring.services.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/posts")
@CrossOrigin
public class PostsController {
    private PostService postService;

    public PostsController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping(value = "/getAll")
    public List<Post> getAll() {
        return this.postService.getAll();
    }

    @GetMapping(value = "/get")
    public Post getById(@RequestParam int id) {
        return this.postService.getById(id);
    }

    @GetMapping(value = "/getByUser")
    public List<Post> getByUserId(@RequestParam int id) {
        return this.postService.getByUserId(id);
    }

    @PostMapping(value = "/add")
    public String add(@RequestBody Post post) {
        return this.postService.add(post);
    }
}
