package tv.codely.apps.mooc.controller.health_check;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tv.codely.apps.RequestTestCase;


public final class HealthCheckGetControllerShould extends RequestTestCase{
	
	@Test
	void checkHealthCheckIsWorking() throws Exception {
		assertResponse("/health-check", HttpStatus.OK.value(), "{'status':'OK'}");
	}
	
	
	
}
