package com.Sample.Project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.Sample.Project.Dao.UserDao;
import com.Sample.Project.Model.UserEntity;


@Controller
public class UserRegController {
	@Autowired
	UserDao ud;

	@GetMapping("/userReg")
	public String userReg(Model model)
	{
		model.addAttribute("user", new UserEntity());
        
		return "userReg";
	}
	
	@PostMapping("/userReg")
	public String registerUser(@ModelAttribute UserEntity u) 
	{	
		ud.insertData(u);
		return "redirect:/userLogin";
	}
	
	@GetMapping("/success")
	public String success()
	{
		return "success";
	}
	
	@GetMapping("/userLogin")
	public String userLogin(Model model)
	{
		model.addAttribute("user", new UserEntity());
		return "userLogin";
	}
	
	@PostMapping("/userLogin")
	public String loginUser(@ModelAttribute UserEntity u)
	{
		
		if(ud.validateUser(u)) {
		return "redirect:/";
		}
		return "redirect:/userLogin";
	}
	
}
