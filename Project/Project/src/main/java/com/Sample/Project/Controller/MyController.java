package com.Sample.Project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Sample.Project.Dao.BookingDao;
import com.Sample.Project.Dao.PaymentsDao;
import com.Sample.Project.Model.Booking;
import com.Sample.Project.Model.Payments;

@Controller
public class MyController {
	@Autowired
	BookingDao bd;
	
	@Autowired
	PaymentsDao p;
	
	@GetMapping("/")
	public String indexpage()
	{
		return "index";
	}
	
	@GetMapping("/about")
	public String aboutpage()
	{
		return "about";
	}
	
	@GetMapping("/contact")
	public String contactpage()
	{
		return "contactUs";
	}
	@GetMapping("/gallery")
	public String gallerypage()
	{
		return "gallery";
	}
	
	 @GetMapping("/service")
	    public String showServices() {
	        return "service";
	    }
	 @GetMapping("/weddingPage")
	    public String weddingPage() {
	        return "weddingPage";
	    }
	 
	 @GetMapping("/booking")
	    public String booking(Model model) {
		 model.addAttribute("book", new Booking());
	        return "booking";
	    }
	 
	 @PostMapping("/booking")
	 public String eventBooking(@ModelAttribute Booking book) 
	 {
		 bd.insertData(book);
		 return "redirect:/payments";
	 }
	 
	 @GetMapping("/payments")
	 public String payments(Model model)
	 {
		 model.addAttribute("pay", new Payments());
		 return "paymentsPage";
	 }
	 
	 @PostMapping("/payments")
	 public String makePay(@ModelAttribute Payments pay)
	 {
		 p.inserData(pay);
		 return "redirect:/success";
	 }
	 
	 @GetMapping("/engagement")
	 public String engage()
	 {
		 return "engagementPage";
	 }
	 @GetMapping("/birthday")
	 public String birthday()
	 {
		 return "birthdayPage";
	 }
	 @GetMapping("/naming")
	 public String naming()
	 {
		 return "namingPage";
	 }
	 
}
