package com.Sample.Project.Model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BookingMapper implements RowMapper<Booking>{

	@Override
	public Booking mapRow(ResultSet rs, int rowNum) throws SQLException {
		Booking b=new Booking();
		b.setId(rs.getInt("id"));
		b.setName(rs.getString("name"));
		b.setDate(rs.getDate("date"));
		b.setTime(rs.getTime("time"));
		b.setContact(rs.getInt("contact"));
		b.setAddress(rs.getString("address"));
		return null;
	}
	
	

}
