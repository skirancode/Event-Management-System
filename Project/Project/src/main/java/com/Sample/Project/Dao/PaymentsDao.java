package com.Sample.Project.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Sample.Project.Model.Payments;

@Repository
public class PaymentsDao {
	
	@Autowired
	JdbcTemplate t;
	
	public void inserData(Payments pay)
	{
		String sql = "insert into payments(payment_mode,cardholder_name,card_number,expiry_date,cvv ,upi_id ,bank_name,payment_date,amount) values(?,?,?,?,?,?,?,?,?)";
		t.update(sql, pay.getPayment_mode(),pay.getCardholder_name(),pay.getCard_number(),pay.getExpiry_date(),pay.getCvv(),pay.getUpi_id(),pay.getBank_name(),pay.getPayment_date(),pay.getAmount());
	}
}
