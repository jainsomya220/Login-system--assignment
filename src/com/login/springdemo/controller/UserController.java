package com.login.springdemo.controller;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.login.springdemo.entity.User;
import com.login.springdemo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	public UserService userService;
	
	@RequestMapping("/login")
	public String showform(Model theModel)
	{
		theModel.addAttribute("logindet",new loginspring());
	    return "login-form";
	}
	@RequestMapping("/welcome")   
	public String welcome(@ModelAttribute("logindet") loginspring log,Model theModel){
		
	   User user=userService.getuser(log);
	 
	   if(user!=null)
	   {
		   theModel.addAttribute("userattribute",user);
		   return "welcome-home";
	   }
	   else
	   {
		   return "redirect:/user/login?success=false";
	   }
	}
	  
}
