package tv.codely.mooc.application.create;

import org.springframework.stereotype.Service;

import tv.codely.mooc.domain.Course;
import tv.codely.mooc.domain.CourseRepository;

@Service
public final class CourseCreator {
	
	private CourseRepository repository;
	
	public CourseCreator(CourseRepository repository) {
		this.repository= repository;
	}
	
	public void create(String id, String name, String duration) {
		Course course= new Course(id, name, duration);
		
		repository.save(course);
	}
}
