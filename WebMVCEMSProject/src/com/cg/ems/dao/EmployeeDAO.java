package com.cg.ems.dao;

import java.util.Collection;

import com.cg.ems.pojo.Employee;

public interface EmployeeDAO {

	void addNewEmployee(Employee employee);

	Collection<Employee> viewAllEmployees();

	Employee getemployeeById(int empId);

	void deleteEmployee(int empId);

}