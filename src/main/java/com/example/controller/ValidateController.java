package com.example.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Employee;

@RestController
@RequestMapping("/validate")
public class ValidateController {

	Logger logger = LoggerFactory.getLogger(getClass());

	
	@PostMapping("/addEmp")
	public void add(@Valid Employee employee) {
		logger.info("addEmp：{}", employee);
	}

	@GetMapping("/selectEmp")
	public void select(@Valid Employee employee) {
		logger.info("selectEmp：{}", employee);
	}

}
