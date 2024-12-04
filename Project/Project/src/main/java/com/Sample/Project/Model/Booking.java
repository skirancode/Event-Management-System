package com.Sample.Project.Model;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

public class Booking {
	 
	private int id;
	private String name;
	private LocalDate date;
	private LocalTime time;
	private int contact;
	private String address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "booking [id=" + id + ", name=" + name + ", date=" + date + ", time=" + time + ", contact=" + contact
				+ ", address=" + address + "]";
	}
	public void setDate(Date date2) {
		this.date=date;		
	}
	public void setTime(Time time2) {
		this.time=time;
		
	}
	 
}
