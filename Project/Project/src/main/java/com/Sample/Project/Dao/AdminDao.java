package com.Sample.Project.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Sample.Project.Model.Admin;
import com.Sample.Project.Model.Booking;
import com.Sample.Project.Model.BookingMapper;

@Repository
public class AdminDao {

	@Autowired
	JdbcTemplate j;
	
	public boolean validateAdmin(Admin admin) {
		
		String sql = "SELECT COUNT(*) FROM admin WHERE name = ? AND password = ?";
		
		Integer count=j.queryForObject(sql,Integer.class,admin.getName(),admin.getPassword());

			return count>0;
	
	}
	
	
	
}
