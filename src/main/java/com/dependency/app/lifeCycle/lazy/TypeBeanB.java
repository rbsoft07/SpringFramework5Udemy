/**
 * 
 */
package com.dependency.app.lifeCycle.lazy;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author rbaez
 *
 */

@Component
@Lazy
public class TypeBeanB {

	
	private static final Logger log = LoggerFactory.getLogger(TypeBeanB.class);

	@Autowired
	private TypeBeanA objTypeBeanA;
	
	@PostConstruct
	public void init(){
		log.info("Method Init of Class TypeBeanB");
	}
	
}
