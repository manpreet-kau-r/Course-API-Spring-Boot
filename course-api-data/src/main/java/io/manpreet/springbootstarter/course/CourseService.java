package io.manpreet.springbootstarter.course;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CourseService 
{	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicId)
	{
		List<Course> courses = new ArrayList<>();
		
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		
		return courses;
	}
	
	public Course getCourse(String id)
	{
		return courseRepository.findById(id).orElse(null);
	}

	public void addCourse(Course course)
	{
		courseRepository.save(course);
	}
	
	public void updateCourse(Course course)
	{
		courseRepository.save(course);
	}
	
	public void deleteCourse(String id)
	{
		courseRepository.deleteById(id);
	}
}
