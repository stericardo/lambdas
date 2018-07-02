package com.stevenprogramming.training.lambda.app.config;

import com.stevenprogramming.training.lambda.app.aop.Profiler;
import org.apache.logging.log4j.core.config.plugins.PluginConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAutoConfiguration
@EnableAspectJAutoProxy
public class ApplicationContext {


}
