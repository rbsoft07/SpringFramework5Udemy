/**
 * 
 */
package com.dependency.app.autowire;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author rbaez
 *
 */
@Component
public class Circle  implements Figure{
	
	
	@Value("${figure.circule.radius}")
	private double radius;
	
	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	@Value("#{systemProperties}")
	private Map<String, String> systemPropertiesMap;

	/**
	 * @return the systemPropertiesMap
	 */
	public Map<String, String> getSystemPropertiesMap() {
		return systemPropertiesMap;
	}

	/**
	 * @param systemPropertiesMap the systemPropertiesMap to set
	 */
	public void setSystemPropertiesMap(Map<String, String> systemPropertiesMap) {
		this.systemPropertiesMap = systemPropertiesMap;
	}

	
	
}
