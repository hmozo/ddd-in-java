package tv.codely.apps.mooc.controller.courses;

import org.junit.jupiter.api.Test;

import tv.codely.apps.RequestTestCase;


public final class CoursesPostControllerShould extends RequestTestCase{

	@Test
	void createOneValidCourse() throws Exception {
		assertRequestWithBody("POST", "/courses/6c52c5e8-36b8-42e8-816e-273f5e7b955a", 
				"{\"name\":\"hola\", \"duration\":\"5 hours\"}", 201);
	}
	
}
