package com.stevenprogramming.training.lambda.app.aop;

import com.stevenprogramming.training.lambda.core.sample.SampleIntStream;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.logging.Logger;

@Aspect
@Component
public class Profiler {

    private static final Logger LOGGER = Logger.getLogger( Profiler.class.getName() );


    @Before("getNamePointcut()")
    public void loggingAdvice(){
        System.out.println("Executing loggingAdvice on getName()");
    }

    @Before("getNamePointcut()")
    public void secondAdvice(){
        System.out.println("Executing secondAdvice on getName()");
    }

    @Pointcut("execution(public String getName())")
    public void getNamePointcut(){}


    @Pointcut("within(com.stevenprogramming..*)")
    protected void loggingOperation() {}

    @Before("loggingOperation()")
    public void logJoinPoint(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        long start = System.currentTimeMillis();
        LOGGER.info("222Call the method > " + method.getName());
        LOGGER.info("222Method execution completed > " + method.getName());
        long elapsedTime = System.currentTimeMillis() - start;
        LOGGER.info("222Method execution time: " + elapsedTime + " milliseconds.");

    }
/*

    @Pointcut("@annotation(LogDurationTime)")
    public void businessMethods() { }

    @Around("businessMethods()")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        Method method = signature.getMethod();
        long start = System.currentTimeMillis();
        LOGGER.info("Call the method > " + method.getName());
        Object output = pjp.proceed();
        LOGGER.info("Method execution completed > " + method.getName());
        long elapsedTime = System.currentTimeMillis() - start;
        LOGGER.info("Method execution time: " + elapsedTime + " milliseconds.");
        return output;
    }*/

}