package com.MyProject.Learn_Spring_AOP.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)   // this annotation only work on Methods
@Retention(RetentionPolicy.RUNTIME)  // should be available at runtime
public @interface TrackTime {
}
