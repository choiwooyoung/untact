package com.sbs.untact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsrhomeController {
	@RequestMapping("/usr/home/main")
	@ResponseBody
	public String showMain() {
		return "안";
	}
	
	

}
