package com.example.demo;


import org.apache.commons.text.CaseUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String hello() {
		return "Hello World applications...";
	}
	
	@GetMapping("/{name}")
	public String helloName(@PathVariable("name") String name) {
		return "Hello " + CaseUtils.toCamelCase(name, true, null) + " !" ;
	}
}
