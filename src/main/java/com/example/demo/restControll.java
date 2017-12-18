package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restControll {

	@Value("${greeting}")
	private String greeting;
	
	@RequestMapping(value="/come", method=RequestMethod.GET)
	public String com(){
		return greeting.replace("\"", "");
	}
	
	@RequestMapping(value="/page", method=RequestMethod.GET)
	public String page(){
		return "<html><body><button id='dd' value='dfdf'></button></body></html>";
	}
	
}
