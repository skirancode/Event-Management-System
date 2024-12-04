package com.Sample.Project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Sample.Project.Dao.AdminDao;
import com.Sample.Project.Dao.BookingDao;
import com.Sample.Project.Model.Admin;
import com.Sample.Project.Model.Booking;


import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AdminController {
	
	@Autowired
	AdminDao ad;
	
	@Autowired
	BookingDao bdao;
	
	@GetMapping("/adminLogin")
	public String adminLogin(Model m)
	{
		m.addAttribute("admin",new Admin());
		return "adminLogin";
	}
	
	@PostMapping("/adminLogin")
	public String loginAd(@ModelAttribute Admin admin) {
		if(ad.validateAdmin(admin))
		return "redirect:/adminIndex";
		
		return "Fail To Enter";
	}
	
	@GetMapping("/adminIndex")
	public String adminIndex()
	{
		return "adminIndex";
	}
	
		
	@GetMapping("/totalbooking")
	public String totalb(Model model){
		model.addAttribute("booking",bdao.totalB());

		return "TotalBooking";
	}
	
	
}
