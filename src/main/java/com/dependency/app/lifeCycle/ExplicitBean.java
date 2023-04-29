/**
 * 
 */
package com.dependency.app.lifeCycle;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author rbaez
 *
 */
@Component
//@Scope("prototype")
public class ExplicitBean {

	
	private static final Logger log = LoggerFactory.getLogger(ExplicitBean.class);

	public void init() {
		log.info("Init Method Of Explicit Bean");
	}
	
	public void destroy() {
		log.info("Destroy Method Of Explicit Bean");
	}
	
}
