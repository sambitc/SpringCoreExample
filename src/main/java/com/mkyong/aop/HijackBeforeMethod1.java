package com.mkyong.aop;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class HijackBeforeMethod1 implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target)
            throws Throwable {
        System.out.println("----------"+method.getName());
        System.out.println("----------"+target.getClass().getName());
        ((CustomerService)target).printName();
    }
}