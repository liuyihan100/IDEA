package com.gui.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyAspect {
    @Before(value = "execution(* com.gui.dao.*.*(..))")
    public void before(JoinPoint point){
        Object[] args = point.getArgs();
        String name = point.getSignature().getName();
        System.out.println(name + Arrays.toString(args));
    }

    @AfterReturning(value = "execution(* com.gui.dao.*.*(..))",returning = "result")
    public void toReturn(Object result){
        System.out.println(result);
    }
}
