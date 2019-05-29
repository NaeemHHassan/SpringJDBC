package com.softechsol.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softechsol.jdbc.employee.Employee;
import com.softechsol.jdbc.employee.EmployeeDAO;
import com.softechsol.jdbc.employee.EmployeeDAOImpl;

public class JDBCTest {

	public static void main(String[] args) {

		ApplicationContext cont = new ClassPathXmlApplicationContext("com/softechsol/jdbc/config.xml");

		EmployeeDAO empImpl = (EmployeeDAOImpl) cont.getBean("empDAOImlp");

		List<Employee> list = empImpl.selectAll();
		System.out.println(list.toString());

	}

}
