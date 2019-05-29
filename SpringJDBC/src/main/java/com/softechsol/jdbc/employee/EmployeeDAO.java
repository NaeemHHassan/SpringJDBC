package com.softechsol.jdbc.employee;

import java.util.List;

public interface EmployeeDAO {

	public int create(String sql);

	public Employee select(Integer id);
	
	public List<Employee> selectAll();
}
