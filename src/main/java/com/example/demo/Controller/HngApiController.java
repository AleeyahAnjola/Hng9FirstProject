package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.HngApiEntity;

@RestController
@RequestMapping("/user")
public class HngApiController {
	@GetMapping("/getDetails")
	public HngApiEntity hng() {
		HngApiEntity hng = new HngApiEntity();
		hng.setSlackUsername("anjolaoluwami20");
		hng.setBackend(true);
		hng.setAge(18);
		hng.setBio("I'm a java backend developer hoping to learn how to get better at what I do");
		
		hng.getSlackUsername();
		hng.getBackend();
		hng.getAge();
		hng.getBio();
		return hng;
		
	}
}
