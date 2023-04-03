package com.demo2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/demo")
	public String getDemo()
	{
		return "Wel come to Sprong Boot Azur Demo2 Updated after new code comitted.....";
	}

}
