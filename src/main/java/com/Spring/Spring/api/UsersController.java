package com.Spring.Spring.api;

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
	
	
}