package com.softechsol.jdbc.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("empDAOImlp")
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private JdbcTemplate templ;

	public JdbcTemplate getTempl() {
		return templ;
	}

	public void setTempl(JdbcTemplate templ) {
		this.templ = templ;
	}

	public int create(String sql) {
		return templ.update(sql);
	}

	public Employee select(Integer id) {
		return templ.queryForObject("select * from employee_tb where id=?", new EmployeeRowMapper(), id);

	}

	public List<Employee> selectAll() {

		return templ.query("select * from employee_tb", new EmployeeRowMapper());
	}

}
