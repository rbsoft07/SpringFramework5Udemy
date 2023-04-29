/**
 * 
 */
package com.dependency.app.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author rbaez
 *
 */
@Component
public class Square implements Figure {

	@Value("${fig.square.side:8}")
	private double side;
	
	@Override
	public double calcularArea() {

		return side*side;
	}

	
}
