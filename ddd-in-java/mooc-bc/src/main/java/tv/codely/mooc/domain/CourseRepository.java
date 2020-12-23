package tv.codely.mooc.domain;

import java.util.Optional;


public interface CourseRepository {

	public void save(Course course);
	
	public Optional<Course> search(String id);
	
}
