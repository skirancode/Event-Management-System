package com.Sample.Project.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Sample.Project.Model.UserEntity;

@Repository
public class UserDao {
	
	@Autowired
	JdbcTemplate t;
	
	public void insertData(UserEntity u) {
		String sql="insert into user_entity(user_name,contact_no,email,city,password) values(?,?,?,?,?)";
		t.update(sql, u.getName(), u.getContactNo(),  u.getEmail(),  u.getCity(),  u.getPassword());
	
	}
	
	 public boolean validateUser(UserEntity u) {
	        String sql = "SELECT COUNT(*) FROM user_entity WHERE user_name = ? AND password = ?";
	        Integer count = t.queryForObject(sql, Integer.class, u.getName(),u.getPassword());
	        
	        
	        return  count > 0 ; // Returns true if user exists, false otherwise
	    }
}
