package com.cdac.training.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cdac.training.springweb.model.User;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String showLoginForm(Model model) {

		User user =new User();
		model.addAttribute("u",user);
		return "login"; // returns login.jsp + user object
	}

	@PostMapping("/login-success")
	public String display(@ModelAttribute("u") User user,Model model) {

		model.addAttribute("username",user.getUsername());
		model.addAttribute("password",user.getPassword());
//		System.out.println(user.getUsername());
		return "result";// returns result.jsp + username & password attributes
	}



}
