package com.Sample.Project.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Sample.Project.Model.Booking;


@Repository
public class BookingDao {
	@Autowired
	JdbcTemplate t;
	
	public void insertData(Booking b) {
		String sql="insert into EventBooking(name,date,time,contact,address) values(?,?,?,?,?)";
		t.update(sql,b.getName(),b.getDate(),b.getTime(),b.getContact(),b.getAddress());
	
	}
	public List<Booking> totalB(){
		String sql="SELECT * FROM EventBooking";
		return t.query(sql, new BeanPropertyRowMapper<>(Booking.class));
		
	}
	
}
