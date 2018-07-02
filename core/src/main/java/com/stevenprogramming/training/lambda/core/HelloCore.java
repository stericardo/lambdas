package com.stevenprogramming.training.lambda.core;

import org.springframework.stereotype.Component;

@Component
public class HelloCore {

	public String getGreeting(String name) {
		return "LAMBDAS CORE SAYS >>> Hello " + name ;
	}
}