package com.example.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IUserService;
import com.example.entity.User;

@RestController
public class BugController {
	@Autowired
	IUserService userService;

	@GetMapping("/user")
	Iterable<User> getUsers() {
		return userService.getUsers();
	}
	
	@GetMapping("/user/{id}")
	Optional<User> getUsers(@PathVariable("id") Integer id) {
		return userService.getUser(id);
	}

	@PostMapping("/user") // create
	@ResponseStatus(code = HttpStatus.CREATED)
	void createUser(@RequestBody @Valid User user) {
	
		userService.saveUser(user);
	}
}
