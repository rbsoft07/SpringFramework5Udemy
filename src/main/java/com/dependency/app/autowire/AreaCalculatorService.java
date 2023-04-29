/**
 * 
 */
package com.dependency.app.autowire;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rbaez
 *
 */
@Service
public class AreaCalculatorService {

	
	private static final Logger log = LoggerFactory.getLogger(AreaCalculatorService.class);

	
	@Autowired
	private List<Figure> lstFigure;
 	
	@Autowired
	private Circle cir;
	
	public double getTotalCalcArea() {
		double area = 0;
		for (Figure figure : lstFigure) {
			area+= figure.calcularArea();
		}
		return area;
	}
	
	
	public String getPropertSystem() {
		Iterator iter =cir.getSystemPropertiesMap().entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();

			return"Clave  : { "+ entry.getKey() +" }  Valor : { "+ entry.getValue()+" } " ; 
		}
		return "No valor";
	}
	
	
}
