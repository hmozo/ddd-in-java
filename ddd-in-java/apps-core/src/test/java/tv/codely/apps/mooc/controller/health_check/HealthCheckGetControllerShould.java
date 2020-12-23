package tv.codely.apps.mooc.controller.health_check;



import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import tv.codely.apps.RequestTestCase;



public final class HealthCheckGetControllerShould extends RequestTestCase{
	
	@Test
	void checkHealthCheckIsWorking() throws Exception {
		assertResponse("/health-check", HttpStatus.OK.value(), "{'status':'OK'}");
	}
	
	
	
}
