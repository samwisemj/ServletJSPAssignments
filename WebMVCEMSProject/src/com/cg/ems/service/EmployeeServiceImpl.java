package com.cg.ems.service;

import java.util.Collection;

import com.cg.ems.dao.EmployeeDAO;
import com.cg.ems.dao.EmployeeDAOImpl;
import com.cg.ems.pojo.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDAO dao = new EmployeeDAOImpl();
	
	/* (non-Javadoc)
	 * @see com.cg.ems.service.EmployeeService#addNewEmployee(com.cg.ems.pojo.Employee)
	 */
	@Override
	public void addNewEmployee(Employee employee) {
		dao.addNewEmployee(employee);
	}
	
	/* (non-Javadoc)
	 * @see com.cg.ems.service.EmployeeService#viewAllEmployees()
	 */
	@Override
	public Collection<Employee> viewAllEmployees(){
		return dao.viewAllEmployees();
	}
	/* (non-Javadoc)
	 * @see com.cg.ems.service.EmployeeService#getemployeeById(int)
	 */
	@Override
	public Employee getemployeeById(int empId) {
		return dao.getemployeeById(empId);
	}
	/* (non-Javadoc)
	 * @see com.cg.ems.service.EmployeeService#deleteEmployee(int)
	 */
	@Override
	public void deleteEmployee(int empId) {
		dao.deleteEmployee(empId);
	}
}
