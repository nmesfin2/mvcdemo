package com.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/auth")
public class AuthController {
	@GetMapping("/login.html")
	public String getLoginPage() {
		return "login";
	}
}
