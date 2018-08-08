package com.cg.ems.controller;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.ems.pojo.Employee;
import com.cg.ems.service.EmployeeService;
import com.cg.ems.service.EmployeeServiceImpl;

@WebServlet("*.app")
public class AppController extends HttpServlet {

	private EmployeeService service = new EmployeeServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		HttpSession session = request.getSession();
		System.out.println(action);
		switch (action) {
		case "/addnew.app":
			response.sendRedirect("addnew.jsp");
			break;
		case "/save.app":
			int empId = Integer.parseInt(request.getParameter("txtId"));
			String empName = request.getParameter("txtName");

			Employee employee = new Employee(empId, empName);

			service.addNewEmployee(employee);

			response.sendRedirect("viewall.app");

			// response.sendRedirect("home.html");
			/*
			 * Collection<Employee> employees = service.viewAllEmployees();
			 * request.setAttribute("employees", employees); RequestDispatcher dispatcher =
			 * request.getRequestDispatcher("viewAll.jsp"); dispatcher.forward(request,
			 * response);
			 */
			break;

		case "/viewall.app":
			Collection<Employee> employees = service.viewAllEmployees();
			request.setAttribute("employees", employees);
			RequestDispatcher dispatcher = request.getRequestDispatcher("viewAll.jsp");
			dispatcher.forward(request, response);
			break;

		case "/delete.app":
			service.deleteEmployee(Integer.parseInt(request.getParameter("empId")));
			response.sendRedirect("viewall.app");
			break;
		case "/editform.app":
			employee = service.getemployeeById(Integer.parseInt(request.getParameter("empId")));
			request.setAttribute("employee", employee);
			dispatcher = request.getRequestDispatcher("addnew.jsp");
			dispatcher.forward(request, response);
			break;

		case "/home.app":
			String username = request.getParameter("username");
			session = request.getSession();
			session.setAttribute("username", username);
			response.sendRedirect("home.jsp");
			break;
		case "/loginForm.app":
			response.sendRedirect("login.jsp");
			break;
		case "/login.app":
			username = request.getParameter("txtUserName");
			String password = request.getParameter("txtPassword");
			if (username.equals("Satyen") && password.equals("Password")) {
				session = request.getSession();
				session.setAttribute("username", username);
				response.sendRedirect("home.jsp");
			} else {
				response.sendRedirect("login.jsp");
			}
			break;
		case "/logout.app":

			session.setAttribute("username", "Guest");
			response.sendRedirect("index.jsp");

			break;
		default:
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
