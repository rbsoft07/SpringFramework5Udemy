/**
 * 
 */
package com.dependency.app.profiles;

import org.springframework.stereotype.Component;

/**
 * @author rbaez
 *
 */
@Component
public interface EnviromentService {

	public String getEnviroment();
}
