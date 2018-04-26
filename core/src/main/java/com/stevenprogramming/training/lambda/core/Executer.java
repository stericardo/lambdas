package com.stevenprogramming.training.lambda.core;

/**
 * @Autor Steven Ricardo Mendez Brenes
 * @date 2018-Apr-26 3:27:39 PM
 * @Version 1.0
 */
public class Executer {

	private static Executer instance;

	private Executer() {
	}

	public static Executer getInstance() {
		if (instance == null) {
			synchronized (Executer.class) {
				if (instance == null) {
					instance = new Executer();
				}
			}
		}
		return instance;
	}

	public void exec(Execute executer) {
		executer.execute();
	}
}
