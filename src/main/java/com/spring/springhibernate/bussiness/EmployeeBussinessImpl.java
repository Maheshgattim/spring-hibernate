package com.spring.springhibernate.bussiness;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.spring.springhibernate.dao.EmployeeDao;
import com.spring.springhibernate.entities.Employee;

@Component
public class EmployeeBussinessImpl implements EmployeeBussiness {
	
	@Autowired
	private EmployeeDao employeeDao;

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void save(Employee employee) {
		
		employeeDao.save(employee);
		
	}

	public void update(Employee employee) {

		employeeDao.update(employee);
	}

	public void delete(Employee employee) {

		employeeDao.delete(employee);
	}

	public Employee findById(int id) {

		return employeeDao.findById(id);
	}

	public List<Employee> findAll() {
		return employeeDao.findAll();
	}
	

}
