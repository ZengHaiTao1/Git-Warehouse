package com.spring.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class myAOP {
	
	@Before(value="myAOP.pointcut2(),myAOP.pointcut4()")
	public void before(){
		System.out.println("前置增强===========");
	}
	
	@Around(value="myAOP.pointcut3()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("环绕前增强==========");
		Object obj  = joinPoint.proceed();
		System.out.println("环绕后增强==========");
		return obj;
	}
	
	@AfterThrowing(value="myAOP.pointcut1()",throwing="e")
	public void afterThrowing(Throwable e){
		System.out.println("异常抛出增强========="+e.getMessage());
	}
	
	@AfterReturning(value="myAOP.pointcut4()",returning="result")
	public void afterReturning(Object result){
		System.out.println("后置增强==========="+result);
	}
	
	// 最终通知
		@After(value="myAOP.pointcut1()")
		public void after(){
			System.out.println("最终增强============");
		}
		
	//配置切面
	@Pointcut(value="execution(* com.spring.AOP.UserDAOImol.find(..))")
	private void pointcut1(){}
	@Pointcut(value="execution(* com.spring.AOP.UserDAOImol.save(..))")
	private void pointcut2(){}
	@Pointcut(value="execution(* com.spring.AOP.UserDAOImol.update(..))")
	private void pointcut3(){}
	@Pointcut(value="execution(* com.spring.AOP.UserDAOImol.delete(..))")
	private void pointcut4(){}
}
