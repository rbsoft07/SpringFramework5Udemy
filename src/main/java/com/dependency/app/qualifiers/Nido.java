/**
 * 
 */
package com.dependency.app.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author rbaez
 *
 */
@Component
public class Nido {

	
	private static final Logger log = LoggerFactory.getLogger(Nido.class);
	
	@Autowired
	private Animal animal; 
	
	public void imprimir() {
		log.info("El nido tiene el pajaro : {}" , animal.getNombre());
	}

	
}
