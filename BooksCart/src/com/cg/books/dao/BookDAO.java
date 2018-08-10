package com.cg.books.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cg.books.pojo.Book;

public class BookDAO {

	private List<Book> books;

	public List<Book> getBooks() {
		return books;
	}

	public List<Book> getCart() {
		return new ArrayList<Book>(cart);
	}

	private Set<Book> cart;

	public BookDAO() {

		books = new ArrayList<>();
		books.add(new Book("Introduction to Python", "Vishya Soori", "ISBN_79865320", 599.00));
		books.add(new Book("A Beginers Guide to to C", "Yash Ratanavali", "ISBN_77564220", 499.00));
		books.add(new Book("Web Development for Novice", "Dan Henry", "ISBN_69789520", 949.00));
		books.add(new Book("Experts Guide to Java, 2nd Edition", "Brian Storus", "ISBN_6946565610", 1599.00));
		books.add(new Book("An Indepth of Machine Learning", "Satish Bhadra", "ISBN_698845220", 1299.00));
		books.add(new Book("Introduction to JavaScript, Expert Edition", "Satyam Ahuja", "ISBN_69811120", 1630.00));
		books.add(new Book("Introduction to Data Science", "Robert Gosling", "ISBN_98565320", 999.00));
		books.add(new Book("Me, a Full Stack developer, 4th Edition", "James Brown", "ISBN_69995320", 1999.00));

		cart = new HashSet<>();
	}

	public void addNewBookToCart(String isbn) {
		for (Book book : books) {
			if (book.getIsbn().equalsIgnoreCase(isbn)) {
				book.setQuantity(book.getQuantity() + 1);
			}
		}

		for (Book book : books) {
			if (book.getIsbn().equalsIgnoreCase(isbn)) {
				cart.add(book);
			}
			
		}
	}

	public void removeBookfromCart(String isbn) {
		for (Book book : cart) {
			if (book.getIsbn().equalsIgnoreCase(isbn))
				book.setQuantity(book.getQuantity() - 1);
		}
		for (Book book : cart) {
			if ((book.getIsbn().equalsIgnoreCase(isbn)) && (book.getQuantity() == 0))
				cart.remove(book);break;
		}

	}

	public int getCartCount() {
		return cart.size();
	}

}
