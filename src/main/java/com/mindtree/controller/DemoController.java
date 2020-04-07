package com.mindtree.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/")
	public String home() {
		return "Spring boot is workingkkk doneee  for testingg";
	}
}
