package com.wakame.wapio.HelloSpringBoot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.wakame.wapio.HelloSpringBoot.web.form.MenuForm;

@Controller
public class SampleController {
	
	@GetMapping("/")
	public String hello(Model model) {
		model.addAttribute("menuForm", new MenuForm());
		return "hello";
	}
	
	@GetMapping("/watson")
	public String iagnosis (Model model) {
		
		return "result";
	}
}
