package com.wakame.wapio.HelloSpringBoot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wakame.wapio.HelloSpringBoot.debug.DebugUtil;
import com.wakame.wapio.HelloSpringBoot.web.form.MenuForm;

@Controller
public class SampleController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String hello(Model model) {
		model.addAttribute("menuForm", new MenuForm());
		return "hello";
	}
	
	@RequestMapping(value="/result", method=RequestMethod.POST)
	public String iagnosis (@ModelAttribute MenuForm menuForm, Model model) {
		DebugUtil.print(menuForm.getProfile());
		return "result";
	}
}
