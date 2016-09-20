package com.ljheee.domain;

import java.util.HashSet;
import java.util.Set;

public class Student {

	Long id;
	String name;
	Set<Course> courses = new HashSet<>();

	public void addCourse(Course c) {
		courses.add(c);
		c.addStudent(this);
	}

	public boolean removeCrouse(Course c) {
		return courses.remove(c);
	}

	public Student() {
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Course> getCourse() {
		return courses;
	}

	public void setCourse(Set<Course> course) {
		this.courses = course;
	}

}
