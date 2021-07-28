package com.spring.bookstore.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.bookstore.entities.books;
import com.spring.bookstore.service.BooksService;

@RestController
public class BookController {

	@Autowired
	private BooksService bookservice;

	@GetMapping("/books")
	public ResponseEntity<List<books>> getAllBooks() {
		List<books> allBooks = bookservice.getAllBooks(); 
		if(allBooks.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(allBooks));
	}

	@GetMapping("/books/{id}")
	public ResponseEntity<books> getBookById(@PathVariable("id") int id) {
		books bookById = bookservice.getBookById(id);
		if(bookById==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return  ResponseEntity.of(Optional.of(bookById));

	}
	
    @PostMapping("/books")	
	public  ResponseEntity<books> CreatenewBooks(@RequestBody books Books){
		books b = null;
		try {
			b = this.bookservice.CreateNewBook(Books);			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.of(Optional.of(b));

	}
    
    @DeleteMapping("/books/{id}")
    public ResponseEntity<Void> DeleteBook(@PathVariable("id") int id){
    	try {
    		this.bookservice.DeleteBook(id);
    		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
     
    	
    }
    
    @PutMapping("/books/{id}")
    public ResponseEntity<books> UpdateUpdateBook(@RequestBody books Book,@PathVariable("id") int id){
    	try {
    		this.bookservice.UpdateBook(Book,id);
    		return ResponseEntity.ok().body(Book);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			
		}
    }

}
