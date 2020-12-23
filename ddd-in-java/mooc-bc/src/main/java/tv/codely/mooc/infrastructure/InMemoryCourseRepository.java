package tv.codely.mooc.infrastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import tv.codely.mooc.domain.Course;
import tv.codely.mooc.domain.CourseRepository;

@Repository
public final class InMemoryCourseRepository implements CourseRepository{
	
	private Map<String, Course> courses= new HashMap<>();

	@Override
	public void save(Course course) {
		this.courses.put(course.getId(), course);
	}

	@Override
	public Optional<Course> search(String id) {
		return Optional.ofNullable(courses.get(id));
	}

}
