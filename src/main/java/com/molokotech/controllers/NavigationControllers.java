package com.molokotech.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class NavigationControllers {

	@GetMapping(value = "/")
	public String indexSecondary() {
		return "index";
	}
	
	@GetMapping(value = "/index")
	public String index() {
		return "index";
	}
	
	
	
}
