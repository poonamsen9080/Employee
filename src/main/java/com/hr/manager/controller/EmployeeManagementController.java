package com.hr.manager.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hr.manager.bean.Employee;
import com.hr.manager.bean.User;
import com.hr.manager.service.EmployeeService;
import com.hr.manager.service.UserService;

@RestController
public class EmployeeManagementController {

	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public ResponseEntity<List<User>> getUser(){
		return new ResponseEntity<>(userService.findAll(),HttpStatus.OK);
	}
	
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> getAllEmployee() {
		return new ResponseEntity<>(employeeService.getAllEmployee(), HttpStatus.OK);
	}

	@GetMapping("/employee/{employee_code}")
	public ResponseEntity<Employee> getEmployeById(@PathVariable("employee_code") long employeeCode) {
		return new ResponseEntity<>(employeeService.getEmployeeById(employeeCode), HttpStatus.OK);
	}

	@PostMapping("/employee")
	public ResponseEntity<Object> saveOrUpdateEmployee(@RequestBody Employee employee) {
		employeeService.saveOrUpdate(employee);
		return new ResponseEntity<>(new HashMap<String,String>().put("message", "success"),HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity<User> findUser(@RequestBody User user){
		return new ResponseEntity<>(userService.findUser(user),HttpStatus.OK);
	}

}
