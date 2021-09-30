package com.hr.manager.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.manager.bean.Employee;
import com.hr.manager.exception.EmployeeNotFoundException;
import com.hr.manager.repository.EmployeeRepository;
import com.hr.manager.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	public Employee getEmployeeById(long employeeCode) {
		Optional<Employee> employee = employeeRepository.findById(employeeCode);
         if(employee.isPresent()) {
			return employee.get();
         }
         else
         {
        	 throw new EmployeeNotFoundException("Employee Not Found");
         }

	}

	@Transactional
	public void saveOrUpdate(Employee employee) {
		employeeRepository.save(employee);
	}

}
