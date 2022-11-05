package com.Spring.Spring.api;

import com.Spring.Spring.entities.User;
import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.Spring.Spring.services.UserService;


@RestController
@RequestMapping(value="/api/users")
@CrossOrigin
public class UsersController {
	
	private UserService userService;
	
	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping(value = "/getAll")
	public ResponseEntity<?> getAll() {
		return ResponseEntity.ok(this.userService.getAll());
	}

	@GetMapping(value = "/get")
	public ResponseEntity<?> get(@RequestParam int id) {
		return ResponseEntity.ok(this.userService.getById(id));
	}

	@PostMapping(value = "/add")
	public String add(@RequestBody User user) {
		return this.userService.add(user);
	}

	@DeleteMapping(value = "/delete")
	public String delete(@RequestParam int id) {
		return this.userService.deleteById(id);
	}

	@GetMapping(value = "/getById")
	public ResponseEntity<?> getById(@RequestParam int id) {
		return ResponseEntity.ok(this.userService.getById(id));
	}

	@GetMapping(value = "/getByEmail")
	public ResponseEntity<?> getByEmail(@RequestParam String email) {
		return ResponseEntity.ok(this.userService.getByEmail(email));
	}

}
