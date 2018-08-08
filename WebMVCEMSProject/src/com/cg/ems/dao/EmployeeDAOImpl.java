package com.cg.ems.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.cg.ems.pojo.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private Map<Integer, Employee> employeeDB = new HashMap<>();
	
	/* (non-Javadoc)
	 * @see com.cg.ems.dao.EmployeeDAO#addNewEmployee(com.cg.ems.pojo.Employee)
	 */
	@Override
	public void addNewEmployee(Employee employee) {
		employeeDB.put(employee.getEmpId(), employee);
	}
	
	/* (non-Javadoc)
	 * @see com.cg.ems.dao.EmployeeDAO#viewAllEmployees()
	 */
	@Override
	public Collection<Employee> viewAllEmployees(){
		return employeeDB.values();
	}
 	
	/* (non-Javadoc)
	 * @see com.cg.ems.dao.EmployeeDAO#getemployeeById(int)
	 */
	@Override
	public Employee getemployeeById(int empId) {
		return employeeDB.get(empId);
	}
	
	/* (non-Javadoc)
	 * @see com.cg.ems.dao.EmployeeDAO#deleteEmployee(int)
	 */
	@Override
	public void deleteEmployee(int empId) {
		employeeDB.remove(empId);
	}
}
