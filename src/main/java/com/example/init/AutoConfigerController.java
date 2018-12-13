package com.example.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.important.autoconfigurer.HelloService;


@RestController
public class AutoConfigerController {

	@Autowired
	HelloService helloService;
	
	@GetMapping("/sayHello")
	public void hello() {
		System.out.println(helloService.sayHello("加"));
	}
	
}
