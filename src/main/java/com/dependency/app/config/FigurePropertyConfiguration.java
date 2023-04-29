/**
 * 
 */
package com.dependency.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author rbaez
 *
 */
@Configuration
@PropertySources({@PropertySource("classpath:figureAreas.properties"),
				  @PropertySource("classpath:squear.properties")	})
public class FigurePropertyConfiguration {

	public  PropertySourcesPlaceholderConfigurer getPropertieSource() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
