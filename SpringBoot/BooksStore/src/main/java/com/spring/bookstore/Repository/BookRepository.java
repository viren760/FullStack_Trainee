package com.spring.bookstore.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.bookstore.entities.books;

@Repository
public interface BookRepository extends CrudRepository<books, Integer> {
 
	
	public Optional<books> findById( int id);
}
