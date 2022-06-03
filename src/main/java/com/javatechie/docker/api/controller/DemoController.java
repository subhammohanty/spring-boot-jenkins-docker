package com.javatechie.docker.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/demo")
	public String demoMethod() {
		return "Congratulation !! On Successful Docker integrtion With Jenkins !!!";
	}

}
