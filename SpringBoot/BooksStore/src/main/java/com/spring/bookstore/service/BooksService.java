package com.spring.bookstore.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.bookstore.entities.books;

@Service
public class BooksService {

	private static List<books> Books = new ArrayList<>();

	static {
		Books.add(new books(1, "JAVA CORE", "JAMES GOSLIN", 900.50));
		Books.add(new books(2, "SPRING BOOT", "ROD JOHNSON", 3000.90));
		Books.add(new books(3, "REACT.JS", "JORDAN WALKE", 1900.00));
		Books.add(new books(4, "ANGULAR JS", "MISKO HEVERY", 2900.30));
	}

	public List<books> getAllBooks() {
		return Books;

	}

	public books getBookById(int id) {
		books book = null;
		try {
			book = Books.stream().filter(e -> e.getId() == id).findFirst().get();
			
		}catch(Exception e) {
         e.printStackTrace();
         ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return book;
	}

	// this is for creating new data with post method ....
	public books CreateNewBook(books b) {
		Books.add(b);
		return b;
	}

	// this is for deleting old data with delete method ...
	public void DeleteBook(int id) {
		 Books = Books.stream().filter(books -> books.getId() != id).collect(Collectors.toList());
		
	}

	// this is used for updating the book ...
	public void UpdateBook(books Book, int id) {
		Books.stream().map(a -> {
			if (a.getId() == id) {
				a.setBook_name(Book.getBook_name());
				a.setBook_author(Book.getBook_author());
				a.setBook_price(Book.getBook_price());
			}
			return a;
		}).collect(Collectors.toList());

	}

}
