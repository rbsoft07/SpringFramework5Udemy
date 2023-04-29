/**
 * 
 */
package com.dependency.app.AOP;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author rbaez
 *
 */
@Component
public class TargetObjectAOP {

	
	private static final Logger log = LoggerFactory.getLogger(TargetObjectAOP.class);

	@ExpecificPointCut
	public void before(String msj) {
		log.info("Method Before - class TargetObjectAOP : {}" , msj);
	}

	public double calularImporte(int a, int b, int c) {
		return (a*b*c)/(a+ Math.sqrt(b));
	}
	
	public double calularMora(int a, int b, int c) {
		return ((a*b*c)/(a+ b));
	}
}
