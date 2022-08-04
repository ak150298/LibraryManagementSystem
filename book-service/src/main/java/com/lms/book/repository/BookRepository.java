package com.lms.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.book.entity.Book;

public interface BookRepository extends JpaRepository<Book, String>{

}
