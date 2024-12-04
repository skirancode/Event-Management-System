package com.Sample.Project.Model;

import java.time.LocalDate;

public class Payments {
	private int id;
	private String payment_mode;
	private String cardholder_name;
	private int card_number; 
	private LocalDate expiry_date; 
	private int cvv;
	private String upi_id;
	private String bank_name;
	private LocalDate payment_date;
	private double amount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPayment_mode() {
		return payment_mode;
	}
	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}
	public String getCardholder_name() {
		return cardholder_name;
	}
	public void setCardholder_name(String cardholder_name) {
		this.cardholder_name = cardholder_name;
	}
	public int getCard_number() {
		return card_number;
	}
	public void setCard_number(int card_number) {
		this.card_number = card_number;
	}
	public LocalDate getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(LocalDate expiry_date) {
		this.expiry_date = expiry_date;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getUpi_id() {
		return upi_id;
	}
	public void setUpi_id(String upi_id) {
		this.upi_id = upi_id;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public LocalDate getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(LocalDate payment_date) {
		this.payment_date = payment_date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Payments [id=" + id + ", payment_mode=" + payment_mode + ", cardholder_name=" + cardholder_name
				+ ", card_number=" + card_number + ", expiry_date=" + expiry_date + ", cvv=" + cvv + ", upi_id="
				+ upi_id + ", bank_name=" + bank_name + ", payment_date=" + payment_date + ", amount=" + amount + "]";
	}
	
}
