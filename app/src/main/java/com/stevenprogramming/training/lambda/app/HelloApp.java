package com.stevenprogramming.training.lambda.app;

import com.stevenprogramming.training.lambda.core.HelloCore;

public class HelloApp {

	public static void main(String[] args) {
		HelloCore helloCore = new HelloCore();
		System.out.println(helloCore.getGreeting("Steven From App to Core " + args[0]));
	}
}