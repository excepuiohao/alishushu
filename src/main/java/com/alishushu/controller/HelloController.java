package com.alishushu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/say")
	public String say() {
		System.out.println("----------------");
		return "NewFile.jsp";
	}
}
