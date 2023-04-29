/**
 * 
 */
package com.dependency.app.AOP;

import org.aspectj.lang.annotation.Pointcut;

/**
 * @author rbaez
 *
 */
public class PointCutClassExample {

	//@Pointcut("execution (double  com.dependency.app.AOP.TargetObjectAOP.*(..))")
	//@Pointcut("within(TargetObjectAOP)")
	@Pointcut("@annotation(ExpecificPointCut)")
	public void targetPointCutObj() {}
	
}
