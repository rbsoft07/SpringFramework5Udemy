/**
 * 
 */
package com.dependency.app.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.security.auth.Destroyable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

/**
 * @author rbaez
 *
 */
 
 
@Component
//@Scope("prototype")
//public class LifeCycleBean implements BeanNameAware, BeanFactoryAware,  ResourceLoaderAware, EnvironmentAware,
//MessageSourceAware,InitializingBean,DisposableBean {
@Lazy
public class LifeCycleBean implements BeanNameAware, InitializingBean,DisposableBean {

	
	private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);

	
	/**
	 * Se realiza la ejeucion despues de la inyeccion de dependencia. 
	 * 
	 **/
	@PostConstruct
	public void init () {
		log.info("Init Bean with @posConstruct - Post Construct of  class LifeCycleBean ");
	}
	
	
	/**
	 * Se ejecutaran antes que el bean sea destruido.
	 * No se ejecuta para los bean con @Scope = prototype
	 * Solo se ejecutan durante una terminacion de la VM de forma normal. 
	 * 
	 * */
	@PreDestroy
	public void destroyBean() {
		log.info("Destroy Bean with @preDestroy - Pre Destroy of  class LifeCycleBean");
	}
	
/*	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		
		log.info("Bean Factory Aware : {}" , beanFactory );
	}


	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		log.info("Resource Bean Aware : {}" , resourceLoader );
		
	}


	@Override
	public void setEnvironment(Environment environment) {
		log.info("Environment Bean Aware : {}" , environment );
		
	}


	@Override
	public void setMessageSource(MessageSource messageSource) {
		log.info("Message Source Bean Aware : {}" , messageSource );
		
	}

*/
	@Override
	public void setBeanName(String name) {
		log.info("Bean Name Aware : {}" , name );
		
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("afterPropertiesSet() -- Method After Property Set Of IntitializingBean");
		
	}


	@Override
	public void destroy() throws Exception {
		log.info("destroy() -- Method Destroy Of DisposableBean");
		
	}
	

}
