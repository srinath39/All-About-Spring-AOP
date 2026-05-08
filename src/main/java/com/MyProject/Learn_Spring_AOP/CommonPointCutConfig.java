package com.MyProject.Learn_Spring_AOP;


import org.aspectj.lang.annotation.Pointcut;

public class CommonPointCutConfig {

    @Pointcut("execution(* com.MyProject.Learn_Spring_AOP.MyApplication.*.*.*(..))")
    public void businessAndDataServicePointCutConfig(){}

    @Pointcut("execution(* com.MyProject.Learn_Spring_AOP.MyApplication.Business.*.*(..))")
    public void businessServicePointCutConfig(){}

    @Pointcut("execution(* com.MyProject.Learn_Spring_AOP.MyApplication.Data.*.*(..))")
    public void dataServicePointCutConfig(){}

    @Pointcut("bean(*Service*)")   // all the classes with "service" content included will be considered
    public void allPackageConfigBean(){}
}
