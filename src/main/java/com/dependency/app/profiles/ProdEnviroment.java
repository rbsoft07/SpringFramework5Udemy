/**
 * 
 */
package com.dependency.app.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author rbaez
 *
 */
@Service
@Profile({"Prod"})
public class ProdEnviroment implements EnviromentService {

	@Override
	public String getEnviroment() {
		return "Prod Enviroment Configuration..";
	}

}
