package com.MyProject.Learn_Spring_AOP.Aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class TimeTrackingAspect {

    private Logger logger= LoggerFactory.getLogger(getClass());


    @Around("com.MyProject.Learn_Spring_AOP.CommonPointCutConfig.allPackageConfigBean()")
    public Object getExecutionTimeOfMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        long startTimeMilliSeconds=System.currentTimeMillis();
        // method execution
        Object object=proceedingJoinPoint.proceed();
        long stopTimeMilliseconds=System.currentTimeMillis();
        long totalTimeMilliseconds=stopTimeMilliseconds-startTimeMilliSeconds;
        logger.info("Around aspect : of method {},execution time is {} ms",proceedingJoinPoint,totalTimeMilliseconds);
        return object;
    }
}
