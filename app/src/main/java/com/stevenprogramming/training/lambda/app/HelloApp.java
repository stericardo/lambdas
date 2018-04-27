package com.stevenprogramming.training.lambda.app;

import com.stevenprogramming.training.lambda.core.HelloCore;
import com.stevenprogramming.training.lambda.core.builder.Builder;
import com.stevenprogramming.training.lambda.core.builder.impl.BuilderImpl;

public class HelloApp {

	public static void main(String[] args) {
		HelloCore helloCore = new HelloCore();
		System.out.println(helloCore.getGreeting("Steven From App to Core " + args[0]));
		try {
			if (null != args[0]) {
				int option = Integer.parseInt(args[0]);
				Builder builder = BuilderImpl.getInstance();
				builder.build(option);
				System.out.println("***********************************************************");
				builder.build(2);
			}
		} catch (NumberFormatException nFE) {
			System.out.println("Error >>> " + nFE.toString());
			nFE.printStackTrace();
		}

	}
}