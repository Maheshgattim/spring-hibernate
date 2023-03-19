package com.spring.springhibernate;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.springhibernate.bussiness.EmployeeBussiness;
import com.spring.springhibernate.bussiness.EmployeeBussinessImpl;
import com.spring.springhibernate.entities.Employee;

public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("configmetadata.xml");
        
       EmployeeBussiness employeeBussiness = (EmployeeBussinessImpl)context.getBean("employeeBussinessImpl");
       
      /* Employee employee = new Employee();
       employee.setId(3);    
       employee.setEname("surendra");
       employee.setAddress("pallakollu");
       employee.setContact("9618379131");
       employee.setExp(10);
       employeeBussiness.save(employee);*/
       
       /*Employee employee = new Employee();
       employee.setId(3);    
       employee.setEname("raj kiran");
       employee.setAddress("hyd");
       employee.setContact("9618379131");
       employee.setExp(10);
       employeeBussiness.update(employee);*/
       
      /* Employee employee = new Employee();
       employee.setId(3);
       employeeBussiness.delete(employee);*/
       List<Employee> employee=employeeBussiness.findAll();
       for(Employee employe : employee) {
       System.out.print("Id: "+employe.getId());
       System.out.println(" - "+employe.getEname());
       }
    }
}
