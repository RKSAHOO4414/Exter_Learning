package com.my.book.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.my.model.book.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer>{

	
	
}
