package com.java.daikichiroutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication

@RestController
public class DaikichiroutesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiroutesApplication.class, args);
	}
	
	@RequestMapping("/")
	public String tryThis() {
		return "try '/daikichi' ...";
	}
	
	
@RestController
@RequestMapping("/daikichi")
	public class DaikichiController{

	 @RequestMapping("")
	 public String welcome() {
	 	return "Welcome, grasshopper!";
     }
	 @RequestMapping("/today")
	 	public String today() {
	 	return "Today you will find luck in all your endeavors!";
	 }
	 	
	 @RequestMapping("/tomorrow")
	 	public String tomorrow() {
	 	return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	 }
}
}