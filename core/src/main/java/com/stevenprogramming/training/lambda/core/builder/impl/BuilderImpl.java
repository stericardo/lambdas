package com.stevenprogramming.training.lambda.core.builder.impl;

import com.stevenprogramming.training.lambda.core.Executer;
import com.stevenprogramming.training.lambda.core.builder.Builder;
import com.stevenprogramming.training.lambda.core.sample.SampleFunctionalInterface;
import com.stevenprogramming.training.lambda.core.sample.SampleIntStream;

/**
 * @Autor Steven Ricardo Mendez Brenes
 * @date  2018-Apr-25 6:06:08 PM 
 * @Version 1.0
 */
public class BuilderImpl implements Builder{

	private static BuilderImpl instance;

	private BuilderImpl() {
	}

	public static BuilderImpl getInstance() {
		if (instance == null) {
			synchronized (BuilderImpl.class) {
				if (instance == null) {
					instance = new BuilderImpl();
				}
			}
		}
		return instance;
	}
	
	@Override
	public void build(int type) {
		switch(type){
		case 1: 
			printBuilderImpl(SampleIntStream.class.getName());
			Executer.getInstance().exec(new SampleIntStream());
			break;
		case 2: 
			printBuilderImpl(SampleFunctionalInterface.class.getName());
			Executer.getInstance().exec(new SampleFunctionalInterface());
			break;
			default: return;
		}
		
	}
	
	private void printBuilderImpl(String name) {
		System.out.println("Class Implementation >> " + name);
	}

}

