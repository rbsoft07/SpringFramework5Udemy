/**
 * 
 */
package com.dependency.app.profiles;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author rbaez
 *
 */
@Service
@Profile("Dev")
public class DevEnviroment implements EnviromentService{

	@Override
	public String getEnviroment() {
		return "Dev Enviroment Configuration..";
	}

}
