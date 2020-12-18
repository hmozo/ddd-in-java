package tv.codely.apps.mooc.controller.courses;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;
import lombok.NoArgsConstructor;

@RestController
public class CoursesPostController {

	@PostMapping("/courses/{id}")
	public ResponseEntity handle(@PathVariable String id, @RequestBody Request body) {
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	
}



