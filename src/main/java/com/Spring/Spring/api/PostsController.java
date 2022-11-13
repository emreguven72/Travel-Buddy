package com.Spring.Spring.api;

import com.Spring.Spring.entities.Post;
import com.Spring.Spring.services.PostService;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(this.postService.getAll());
    }

    @GetMapping(value = "/get")
    public ResponseEntity<?> getById(@RequestParam int id) {
        return ResponseEntity.ok(this.postService.getById(id));
    }

    @GetMapping(value = "/getByUser")
    public ResponseEntity<?> getByUserId(@RequestParam int id) {
        return ResponseEntity.ok(this.postService.getByUserId(id));
    }

    @PostMapping(value = "/add")
    public ResponseEntity<?> add(@RequestBody Post post) {
        return ResponseEntity.ok(this.postService.add(post));
    }
}
