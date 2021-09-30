package com.hr.manager.service;

import java.util.List;


import com.hr.manager.bean.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployee();
	
	public Employee getEmployeeById(long employeeCode);
	
	public void saveOrUpdate(Employee employee);
}
