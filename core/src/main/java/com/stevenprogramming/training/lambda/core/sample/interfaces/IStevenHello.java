package com.stevenprogramming.training.lambda.core.sample.interfaces;

/**
 * @Autor Steven Ricardo Mendez Brenes
 * @date 2018-Apr-27 10:38:40 AM
 * @Version 1.0
 */
@FunctionalInterface
public interface IStevenHello {

	public String sayHello(String name);

	public default String sayHelloWord() {
		return "Hello word";
	}

}
