/**
 * 
 */
package com.dependency.app.AOP;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author rbaez
 *
 */
@Component
@Aspect
@Order(1)
public class MyAspectClass2 {

	
	private static final Logger log = LoggerFactory.getLogger(MyAspectClass2.class);
	
	@Before("PointCutClassExample.targetPointCutObj()")
	public void metodoBefore(JoinPoint joinPoint) {
		log.info(" 2**AOP Join Point -- Method Name: {}" , joinPoint.getSignature().getName());
		log.info(" 2**AOP Join Point -- Method DeclaringTypeName: {}" , joinPoint.getSignature().getDeclaringTypeName());
		log.info(" 2**AOP Join Point -- Method Modifiers: {}" , joinPoint.getSignature().getModifiers());
		
		int i =1;
		for (Object  lista : joinPoint.getArgs()) {
			log.info(" 2**AOP Join Point -- Method Arguments {}: {} " ,i++, lista.toString());
		}
		
		log.info(" 2**AOP Join Point -- Method Kind: {}" , joinPoint.getKind());
		log.info(" 2**MSJ : Method Before - Class MyAspectClass: metodo intervenido");
	}

}
