package com.mindtree.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/no")
	public String home() {
		return "Spring boot is workingkkk doneee  for testing!";
	}
}
