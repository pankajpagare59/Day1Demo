package com.Day1.Day1Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController 
public class Day1DemoApplication {

	private final PersonProperties personeProperties;
	
	@Autowired
	public Day1DemoApplication(PersonProperties personeProperties)
	{
		this.personeProperties= personeProperties;
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(Day1DemoApplication.class, args);
				
	}
	@Value("${Name}")
	private String  message; 
	
	/*@RequestMapping("/")
	@ResponseBody
	public String doPrint()
	{
		System.out.println("HI Now "+ message);
		return message;
	}*/
	
	@RequestMapping("/")
	public String greetings()
	{
	
		return personeProperties.getGreeting() + "Spring Booooot" + personeProperties.getFarewell() +" Spring Boot!";
 	}
	
}
