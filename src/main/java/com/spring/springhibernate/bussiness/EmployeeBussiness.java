package com.spring.springhibernate.bussiness;

import java.util.List;

import com.spring.springhibernate.entities.Employee;

public interface EmployeeBussiness {

	public void save(Employee employee);
	
	public void update(Employee employee);
	
	public void delete(Employee employee);
	
	public Employee findById(int id);
	
	public List<Employee> findAll();
}
