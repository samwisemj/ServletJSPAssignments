package com.cg.ems.service;

import java.util.Collection;

import com.cg.ems.pojo.Employee;

public interface EmployeeService {

	void addNewEmployee(Employee employee);

	Collection<Employee> viewAllEmployees();

	Employee getemployeeById(int empId);

	void deleteEmployee(int empId);

}