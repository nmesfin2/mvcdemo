package com.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvcdemo.model.Login;

@Controller
@RequestMapping(path="/auth")
public class AuthController {
	@GetMapping("/login.html")
	public String getLoginPage() {
		return "login";
	}
	
	@PostMapping("/login.html")
	public String validateLogin(@ModelAttribute Login login) {
		System.out.println(login);
		return "home";
	}
}
