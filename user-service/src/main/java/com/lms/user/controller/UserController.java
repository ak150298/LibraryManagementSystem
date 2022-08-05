package com.lms.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.user.entity.User;
import com.lms.user.repository.UserRepository;

@RestController
@RequestMapping("/user-service")
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/ping")
	public String ping() {
		return "user-service is running..";
	}
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {

		userRepo.save(user);

		return user;

	}

}
