package com.eb;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackSwigyServices {
	
	@Pointcut("execution(* Swiggy.*(..))")
	public void vegMenu() {}
	
	//@AfterReturning("vegMenu()")
	//@Around("vegMenu()")
	//@After("vegMenu()")
	@Before("vegMenu()")
	public void Suggestion(JoinPoint p) 
	{
		System.out.println("this is additional method");
	}

}
