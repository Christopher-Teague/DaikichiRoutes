package com.java.daikichiroutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
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
		return "try: /daikichi , /daikichi/today , /daikichi/tomorrow , /daikichi/travel/'some destination' , or /daikichi/lotto/'you favorite number'";
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
	 
     @RequestMapping("/travel/{destination}")
     public String destination(@PathVariable("destination") String destination){
     	return "Congratulations! You will soon travel to " + destination +"!";
     }

     @RequestMapping("/lotto/{number}")
     public String lotto(@PathVariable("number") int number){
    	 if (number % 2 == 0 ) {
    	 return "You will take a grand journey in the near future, but be weary of tempting offers...";
    	 } 
    	 return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends...";
     }
	 
}
}