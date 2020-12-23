package tv.codely.mooc.infrastructure;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Repository;

import tv.codely.mooc.domain.Course;
import tv.codely.mooc.domain.CourseRepository;


public final class InMemoryCourseRepositoryShould{
	
	@Test
	void saveValidCourse() {
		InMemoryCourseRepository repository= new InMemoryCourseRepository();
		repository.save(new Course("some-id", "some-name", "some-duration"));
	}
	
	@Test
	void searchValidCourse() {
		InMemoryCourseRepository repository= new InMemoryCourseRepository();
		Course course= new Course("some-id", "some-name", "some-duration");
		repository.save(course);
		
		assertThat(repository.search(course.getId())).isEqualTo(Optional.of(course));
	}
	
	@Test
	void searchNonExistingCourse() {
		InMemoryCourseRepository repository= new InMemoryCourseRepository();
		
		assertThat(repository.search("non-existing-course-id")).isEmpty();
	}

}
