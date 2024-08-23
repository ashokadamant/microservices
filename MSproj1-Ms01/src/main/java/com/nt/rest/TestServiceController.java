package com.nt.rest;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("TestMs")
public class TestServiceController {
   @GetMapping("/display")
	public ResponseEntity<String> displayMessage(){
	   System.out.println("ravi");
	   System.out.println("ravi1");
		return new ResponseEntity<String>("Welcome to SpringBoot MS",HttpStatus.OK);
	}
}
