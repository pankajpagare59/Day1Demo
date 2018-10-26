/*package com.Day1.Day1Demo;

import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.web.bind.annotation.GetMapping;

public class GettingControler {
	
	private final CounterService countorService;

	public GettingControler(CounterService countorService) {
		super();
		this.countorService = countorService;
	}
	
	
	@GetMapping("/")
	public String hello()
	{
		countorService.increment("counter.services.greeting.invoked");
        return "Hello World!!!";
	}
	

}
*/