package com.cg.books.service;

import java.util.List;
import com.cg.books.dao.BookDAO;
import com.cg.books.pojo.Book;
//service layer thats acts as an interface to controller and the dao
public class Services {

	BookDAO dao;

	public Services() {
		this.dao = new BookDAO();
	}

	public void add(String isbn) {
		dao.addNewBookToCart(isbn);
	}

	public void remove(String isbn) {
		dao.removeBookfromCart(isbn);
	}

	public int getCount() {
		return dao.getCartCount();
	}

	public List<Book> getBooks() {
		return dao.getBooks();
	}

	public List<Book> getCart() {
		return dao.getCart();
	}

	public double[] getTotalQty() {
		return dao.getTotalQty();
	}
}
