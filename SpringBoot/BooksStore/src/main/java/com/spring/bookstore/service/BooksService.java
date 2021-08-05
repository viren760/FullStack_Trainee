package com.spring.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.bookstore.Repository.BookRepository;
import com.spring.bookstore.entities.books;

@Service
public class BooksService {

	@Autowired
	private BookRepository bookrepository;
	
	

	public List<books> getAllBooks() {
		Iterable<books> findAll = this.bookrepository.findAll();
		return (List<books>) findAll;

	}

	public books getBookById(int id) {
		books book = null;
		try {
			book = this.bookrepository.findById(id).orElse(null);

		} catch (Exception e) {
			e.printStackTrace();
			ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return book;
	}

	// this is for creating new data with post method ....
	public books CreateNewBook(books b) {
		books save = this.bookrepository.save(b);
		return save;
	}

	// this is for deleting old data with delete method ...
	public void DeleteBook(int id) {
		this.bookrepository.deleteById(id);  
	}

	// this is used for updating the book ...
	public void UpdateBook(books Book, int id) {
		Book.setId(id);
		this.bookrepository.save(Book);
	}

}
