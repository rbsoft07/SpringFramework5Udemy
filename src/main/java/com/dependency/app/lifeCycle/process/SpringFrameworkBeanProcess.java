/**
 * 
 */
package com.dependency.app.lifeCycle.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.dependency.app.lifeCycle.ExplicitBean;

/**
 * @author rbaez
 *
 */

public class SpringFrameworkBeanProcess implements BeanPostProcessor {

	private static final Logger log = LoggerFactory.getLogger(SpringFrameworkBeanProcess.class);

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		if (bean instanceof ExplicitBean) {
			log.info(" Class SpringFrameworkBeanProcess  -- Method Before Initialization : {}  ", beanName);
		}

		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof ExplicitBean) {
			log.info(" Class SpringFrameworkBeanProcess  -- Method After Initialization : {}  ", beanName);
		}
		return bean;
	}

}
