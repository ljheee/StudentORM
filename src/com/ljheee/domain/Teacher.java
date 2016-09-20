package com.ljheee.domain;
/**
 * 课程--讲师
 * @author ljheee
 *
 */
public class Teacher {
	
	Long id;
	String name;
	String eamil;
	
	public Teacher() {
	}

	public Teacher(String name, String eamil) {
		super();
		this.name = name;
		this.eamil = eamil;
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

	public String getEamil() {
		return eamil;
	}

	public void setEamil(String eamil) {
		this.eamil = eamil;
	}
	
	
	

}
