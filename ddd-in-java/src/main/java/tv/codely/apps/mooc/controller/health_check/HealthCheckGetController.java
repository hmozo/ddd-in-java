package tv.codely.apps.mooc.controller.health_check;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class HealthCheckGetController {
	
	@GetMapping("/health-check")
	public ResponseEntity<Map<String,HttpStatus>> handle(){
		return ResponseEntity.ok(Collections.singletonMap("status", HttpStatus.OK));
		
	}

}
