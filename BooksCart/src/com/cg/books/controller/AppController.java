package com.cg.books.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.books.service.Services;

/**
 * Servlet implementation class AppController
 */
@WebServlet("*.AppController")
public class AppController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	private Services service;
	
    public AppController() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void init(ServletConfig config) throws ServletException {
		service=new Services();
	}
	//standard servlet doGET() method 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String action = request.getServletPath();
		switch (action) {
		case "/redirect.AppController"://redirects to view all books
			goToHome(request,response);
			break;
		case "/addToCart.AppController"://adds an item to cart with help of helper method	
			addToCart(request,response);
			goToHome(request, response);
			break;
		case "/viewCart.AppController"://views cart with help of helper method	
			goToCart(request,response);
			break;
		case "/removeFromCart.AppController"://remove an item from the cart
				removeFromCart(request,response);
			break;
		}
	}

	//helper method to remove an item or a quantity from the cart
	private void removeFromCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service.remove(request.getParameter("isbn"));
		goToCart(request, response);
	}

	//helper method to view the cart
	private void goToCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("cartlist", service.getCart());
		request.setAttribute("cartCount", service.getCount());
		request.setAttribute("totalQtyAndPrice", service.getTotalQty());
		request.getRequestDispatcher("cartdetails.jsp").forward(request, response);
	}
	//helper method to go to the home page
	private void goToHome(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println(service.getBooks());
		request.setAttribute("booklist", service.getBooks());
		request.setAttribute("cartCount", service.getCount());
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}
	
	//helper method to add a new item or quantity to the cart
	private void addToCart(HttpServletRequest request, HttpServletResponse response) {
			service.add(request.getParameter("isbn"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
