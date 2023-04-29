/**
 * 
 */
package com.dependency.app.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author rbaez
 *
 */
@Component
@Primary
public class Caballo extends Animal {

	
	private static final Logger log = LoggerFactory.getLogger(Caballo.class);

	
	public Caballo(@Value("Kenpachy") String nombre,  @Value("5") Integer edad) {
		super(nombre, edad);
		
	}

	public void rebusnar() {
		log.info(" El caballo " +getNombre()+" esta rebusnando." );
	}
	
}
