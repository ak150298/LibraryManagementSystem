package com.lms.book.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.book.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, String>{
	
	List<Book> findByBookIdOrBookNameOrAuthorOrTitle(String bookId, String bookName, String author, String title);
	

}
