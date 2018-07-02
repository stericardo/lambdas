package com.stevenprogramming.training.lambda.app;

import com.stevenprogramming.training.lambda.app.aop.Profiler;
import com.stevenprogramming.training.lambda.core.HelloCore;
import com.stevenprogramming.training.lambda.core.builder.Builder;
import com.stevenprogramming.training.lambda.core.builder.impl.BuilderImpl;
import com.stevenprogramming.training.lambda.core.sample.interfaces.LogDurationTime;
import com.stevenprogramming.training.lambda.core.services.IRunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


import java.util.Optional;

@SpringBootApplication
@ComponentScan({"com.stevenprogramming.training"})
@LogDurationTime
public class HelloApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(HelloApp.class, args);
		IRunService iRunService = (IRunService) applicationContext.getBean("runService");
		iRunService.runApp(args[0]);
	}
}