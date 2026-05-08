package com.MyProject.Learn_Spring_AOP.Aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LoggingAspect {

    private Logger logger= LoggerFactory.getLogger(getClass());
//
//    @Before("com.MyProject.Learn_Spring_AOP.CommonPointCutConfig.businessAndDataServicePointCutConfig()")  // when ?
//    public void logMethodCallBeforeExecution(JoinPoint joinPoint){
//        logger.info("Before execution of {}",joinPoint); // what?
//    }
//
//    @After("com.MyProject.Learn_Spring_AOP.CommonPointCutConfig.businessAndDataServicePointCutConfig()")  // when ?
//    public void logMethodCallAfterExecution(JoinPoint joinPoint){
//        logger.info("After execution of {}",joinPoint); // what?
//    }
//
//    @AfterThrowing(
//            pointcut = "com.MyProject.Learn_Spring_AOP.CommonPointCutConfig.businessAndDataServicePointCutConfig()",
//            throwing = "exception")  // when ?
//    public void logMethodCallAfterExecution(JoinPoint joinPoint,Exception exception){
//        logger.info("After throwing exception of method {} this is the exception {}",joinPoint,exception); // what?
//    }
//
//    @AfterReturning(
//            pointcut = "com.MyProject.Learn_Spring_AOP.CommonPointCutConfig.businessAndDataServicePointCutConfig()",
//            returning = "returnValue")  // when ?
//    public void logMethodCallAfterExecution(JoinPoint joinPoint,Object returnValue){
//        logger.info("After Returning exception of method {} this is the returned value {}",joinPoint,returnValue); // what?
//    }
}
