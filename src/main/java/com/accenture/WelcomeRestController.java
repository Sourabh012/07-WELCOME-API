package com.accenture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private GreetClient greetClient;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg()
	{
		String welcomeMsg = "Welcome to ashok it......";
		String greetMsg = greetClient.invokeGreetApi();
		
		return greetMsg + ", "+welcomeMsg;
	}

}
