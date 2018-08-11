package com.cg.books.pojo;

public class Book {

	private String title;
	private String author;
	private String isbn;
	private double price;
	private int quantity;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
		if(this.quantity < 0) 
			this.quantity=0;
	}

	public Book(String title, String author, String isbn, double price) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
		quantity = 0;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public double getPrice() {
		return price;
	}

	public double getTotalPrice() {
		return quantity*price;
	}
}
