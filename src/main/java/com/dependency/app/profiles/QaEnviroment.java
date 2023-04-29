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
@Profile({"QA","default"})
public class QaEnviroment implements EnviromentService {

	@Override
	public String getEnviroment() {

		return "QA Enviroment Configuration..";
	}

}
