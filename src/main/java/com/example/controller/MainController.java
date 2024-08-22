package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/upasana")
		public String welcome() {
			return "index";
		}
	
	@RequestMapping("/roshan")
	public String home() {
		return "home";
	}
}
