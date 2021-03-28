package com.viviprop.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationControllers {

	@Value(value = "${google.api.key}")
	String API_KEY;
	
	@GetMapping(value = "/")
	public String indexSecondary(Model model) {
		model.addAttribute("apiKey", this.API_KEY);
		return "index";
	}
	
	@GetMapping(value = "/index")
	public String index(Model model) {
		model.addAttribute("apiKey", this.API_KEY);
		return "index";
	}
	
	
}
