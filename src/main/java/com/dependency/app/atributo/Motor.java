/**
 * 
 */
package com.dependency.app.atributo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author rbaez
 *
 */

@Component
public class Motor {

	//@Value("XLS 360")
	private String marca;
	//@Value("1998")
	private Integer modelo;

	
//	
//	/**
//	 * @param marca
//	 * @param modelo
//	 */
//	public Motor( 	@Value("XLS 360") String marca, Integer modelo) {
//		super();
//		this.marca = marca;
//		this.modelo = modelo;
//	}


	/**
	 * @return the marca
	 */
	
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */

	@Value("XLS 360")
	public void setMarca(  String marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public Integer getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	@Value("1998")
	public void setModelo(  Integer modelo) {
		this.modelo = modelo;
	}


	@Override
	public String toString() {
		return "Motor [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	
	
}
