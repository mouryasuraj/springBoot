package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceimpl implements CourseService {
	
	List<Course> list;
	
	public CourseServiceimpl() {
		list = new ArrayList<Course>();
		list.add(new Course(1, "Java", "Beginner to Advanced Java Course"));
		list.add(new Course(2, "JavaScript", "Beginner to Advanced JavaScript Course"));
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		Course c = null;
		for(Course course:list) {
			if(course.getId() == courseId) {
				c = course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}

	@Override
	public Course deleteCourse(long courseId) {
		// TODO Auto-generated method stub
		for(Course course:list) {
			if(course.getId() == courseId) {
				list.remove(course);
				break;
			}
		}
		return null;
	}
	
	
	
	

}
