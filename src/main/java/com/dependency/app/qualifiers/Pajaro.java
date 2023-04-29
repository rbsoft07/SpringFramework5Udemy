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
public class Pajaro extends Animal implements Volador {

	private static final Logger log = LoggerFactory.getLogger(Pajaro.class);

	public Pajaro(@Value("Piolin") String nombre, @Value("30") Integer edad) {
		super(nombre, edad);
	}

	@Override
	public void volar() {
		log.info("Soy un pajaro y estoy volando.");

	}

}
