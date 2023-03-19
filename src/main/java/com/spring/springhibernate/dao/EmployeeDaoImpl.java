package com.spring.springhibernate.dao;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import com.spring.springhibernate.entities.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
    @Transactional
	public void save(Employee employee) {

		hibernateTemplate.save(employee);
	}
    @Transactional
	public void update(Employee employee) {

		hibernateTemplate.update(employee);
	}
    @Transactional
	public void delete(Employee employee) {

		hibernateTemplate.delete(employee);
	}

	public Employee findById(int id) {

		return hibernateTemplate.load(Employee.class,id);
	}

	public List<Employee> findAll() {
		return hibernateTemplate.loadAll(Employee.class);
	}

}
