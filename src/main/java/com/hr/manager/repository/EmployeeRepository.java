package com.hr.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hr.manager.bean.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
