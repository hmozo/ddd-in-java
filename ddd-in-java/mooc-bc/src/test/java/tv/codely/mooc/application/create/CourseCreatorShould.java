package tv.codely.mooc.application.create;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

import tv.codely.mooc.domain.Course;
import tv.codely.mooc.domain.CourseRepository;


public final class CourseCreatorShould {
	
	@Test
	void saveOneValidCourse() {
		CourseRepository repositoryMock= mock(CourseRepository.class);
		CourseCreator creator= new CourseCreator(repositoryMock);
		
		Course course= new Course("some-id", "some-name", "some-duration1");
		
		creator.create(course.getId(), course.getName(), course.getDuration());
		
		verify(repositoryMock, atLeastOnce()).save(course);
	}
	
}
