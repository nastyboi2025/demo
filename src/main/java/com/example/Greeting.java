package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Greeting {
	@RequestMapping("/greeting")
	public @ResponseBody String Greeting(){
		return "Hello Naser this is a test to show its working!!!";
	}

}
