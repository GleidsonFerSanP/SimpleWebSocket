package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class HomeController {
	
	@GetMapping
	public ResponseEntity<?> home(@RequestParam("msg")String msg){
		System.out.println(msg);
		return ResponseEntity.ok(msg);
	}

}
