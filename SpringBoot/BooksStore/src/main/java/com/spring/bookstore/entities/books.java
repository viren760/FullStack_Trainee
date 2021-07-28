package com.spring.bookstore.entities;

public class books {

	private int id;
	private String book_name;
	private String book_author;
	private double book_price;

	public books(int id, String book_name, String book_author, double book_price) {
		super();
		this.id = id;
		this.book_name = book_name;
		this.book_author = book_author;
		this.book_price = book_price;
	}

	public books() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getBook_author() {
		return book_author;
	}

	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}

	public double getBook_price() {
		return book_price;
	}

	public void setBook_price(double book_price) {
		this.book_price = book_price;
	}

	@Override
	public String toString() {
		return "books [id=" + id + ", book_name=" + book_name + ", book_author=" + book_author + ", book_price="
				+ book_price + "]";
	}

}
