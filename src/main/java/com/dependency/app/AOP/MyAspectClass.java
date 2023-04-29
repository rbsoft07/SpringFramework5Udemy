/**
 * 
 */
package com.dependency.app.AOP;

import java.util.Iterator;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author rbaez
 *
 */
@Component
@Aspect
@Order(0)
public class MyAspectClass {

	
	private static final Logger log = LoggerFactory.getLogger(MyAspectClass.class);

	@Before("PointCutClassExample.targetPointCutObj()")
	public void before(JoinPoint joinPoint) {
		log.info(" **AOP Join Point -- Method Name: {}" , joinPoint.getSignature().getName());
		log.info(" **AOP Join Point -- Method DeclaringTypeName: {}" , joinPoint.getSignature().getDeclaringTypeName());
		log.info(" **AOP Join Point -- Method Modifiers: {}" , joinPoint.getSignature().getModifiers());
		
		int i =1;
		for (Object  lista : joinPoint.getArgs()) {
			log.info(" **AOP Join Point -- Method Arguments {}: {} " ,i++, lista.toString());
		}
		
		
		log.info(" **AOP Join Point -- Method Kind: {}" , joinPoint.getKind());
		log.info(" **MSJ : Method Before - Class MyAspectClass: metodo intervenido");
	}
	

}
