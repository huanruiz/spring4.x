package com.smart.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class GreetingBeforeAdvice implements MethodBeforeAdvice {

	/**
	 * 在目标类方法调用前执行
	 */
	public void before(Method method, Object[] args, Object obj) throws Throwable {
		String clientName = (String)args[0];
		System.out.println("How are you！Mr."+clientName+".");
	}
}
