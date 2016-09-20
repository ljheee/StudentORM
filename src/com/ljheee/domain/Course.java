package com.ljheee.domain;

import java.util.HashSet;
import java.util.Set;
/**
 * 课程
 * @author ljheee
 *
 */
public class Course {
	Long id;
	
	/**
	 * 课程名
	 */
	String title;
	
	/**
	 * 任课教师
	 */
	Teacher teacher;
	
	/**
	 * 选该课程的学生集合
	 */
	Set<Student> students = new HashSet<>();
	
	
	public Course() {
	}

	
	/**
	 * 
	 * @param title	课程名
	 * @param teacher	任课教师
	 */
	public Course(String title, Teacher teacher) {
		this.title = title;
		this.teacher = teacher;
	}



	public Course(String title, Set<Student> students) {
		super();
		this.title = title;
		this.students = students;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	/**
	 * 添加选课学生
	 * @param s		学生
	 */
	public void addStudent(Student s){
		students.add(s);
	}
	
	public boolean remove(Student s){
		return students.remove(s);
		
	}
	
	
}
