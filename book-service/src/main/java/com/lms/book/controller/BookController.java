package com.lms.book.controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.book.entity.Book;
import com.lms.book.repository.BookRepository;

@RestController
@RequestMapping("/book-service")
public class BookController {
	
	private static Logger logger = Logger.getLogger(BookController.class.getName());
	@Autowired
	BookRepository bookRepo;
	
	@GetMapping("/ping")
	public String ping() {
		return "book-service is running..";
	}
	
	@PostMapping("/addBook")
	public Book addBook(@RequestBody Book book) {
		bookRepo.save(book);
		return book;
	}
	
	
	@PutMapping("/updateBook")
	public Book EditBook(@RequestBody Book book)
	{
		bookRepo.save(book);
		return book;
		
	}
	
	@DeleteMapping("/deleteById/{bookId}")
	public String deleteBookById(@PathVariable("bookId") String bookId) {
		if(bookRepo.findById(bookId) != null) {
			bookRepo.deleteById(bookId);
			return "book Deleted with id "+bookId;
		} else {
			return "No book found with id "+bookId;
		}
		
	}
	
	@GetMapping("/searchByKey/{key}")
	public List<Book> findByKey(@PathVariable("key") String key){
		System.out.println("Book service called!");
		logger.log(Level.INFO, "Book Service findByKey endpoint called with key : {0}",key);
		return bookRepo.findByBookIdOrBookNameOrAuthorOrTitle(key, key, key, key);
	}
	
	

}
