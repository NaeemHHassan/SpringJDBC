package com.softechsol.jdbc.employee;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();

		emp.setId(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setEmail(rs.getString(3));
		return emp;

	}

}
