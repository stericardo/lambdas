package com.stevenprogramming.training.lambda.core.sample;

import java.util.stream.IntStream;

import com.stevenprogramming.training.lambda.core.Execute;
import com.stevenprogramming.training.lambda.core.sample.interfaces.IStevenHello;

/**
 * @Autor Steven Ricardo Mendez Brenes
 * @date 2018-Apr-27 10:39:50 AM
 * @Version 1.0
 */
public class SampleFunctionalInterface implements Execute {

	@Override
	public void execute() {
		IStevenHello hello = (name) -> "Our Implementation " + name;

		System.out.println(hello.sayHello("Steven HW!!!"));
		System.out.println(hello.sayHelloWord());
	}
}
