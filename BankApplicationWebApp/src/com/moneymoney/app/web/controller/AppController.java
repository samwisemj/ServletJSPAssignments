package com.moneymoney.app.web.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.moneymoney.app.model.service.MMBankAccountService;
import com.moneymoney.framework.service.BankAccountService;

@WebServlet("*.AppController")
public class AppController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AppController() {
	}

	BankAccountService service;

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		service=new MMBankAccountService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String choice = request.getServletPath();
		switch (choice) {

		case "/addSavings.AppController":
			response.sendRedirect("NewSavingsAccountsDetails.jsp");
			break;
		
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
