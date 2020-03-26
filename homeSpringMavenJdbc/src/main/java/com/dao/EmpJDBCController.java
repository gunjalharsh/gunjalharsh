package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import com.homeBeanClasses.homeEmployee;
//@Configuration
//@ComponentScan(basePackages={"com.cts","com.controller"})

public class EmpJDBCController {
	
	
	JdbcTemplate template1;
	public void setTemplate1(JdbcTemplate template1) {
		this.template1 = template1;
	}
	//insert query
	public int save1(homeEmployee p)
	{
		String sql="insert into Emp2(eno,name,salary) values("+p.getEno()+",'"+p.getName()+"',"+p.getSalary()+")";
		return template1.update(sql);
	}
	
	//select query
	public List<homeEmployee> getEmployees()
	{
		return template1.query("select * from Emp2",new RowMapper<homeEmployee>()
				{
				public homeEmployee mapRow(ResultSet rs,int row) throws SQLException
				{
					homeEmployee e=new homeEmployee();
					e.setEno(rs.getInt(1));
					e.setName(rs.getString(2));
					e.setSalary(rs.getFloat(3));
					return e;
				}
				});
		
	}
}
