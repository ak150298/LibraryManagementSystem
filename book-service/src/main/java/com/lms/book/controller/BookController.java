package com.lms.book.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book-service")
public class BookController {
	
	@GetMapping("/ping")
	public String ping() {
		return "book-service is running..";
	}

}
