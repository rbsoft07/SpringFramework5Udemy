/**
 * 
 */
package com.dependency.app.qualifiers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author rbaez
 *
 */
@Component
public class Perro  extends  Animal{

	public Perro(@Value("Escanor") String nombre, @Value("2") Integer edad) {
		super(nombre, edad);
	
	}

	
	
}
