package com.spring.SpringFirstDB;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/hh")
	public static String test() {
		return "index";
		}
	
}
