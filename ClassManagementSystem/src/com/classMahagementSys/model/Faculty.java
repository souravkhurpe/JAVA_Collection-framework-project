package com.classMahagementSys.model;

public class Faculty {
	private int fId;
	private String fName;
	
	private Course course;
	
	public int getfId() {
		return fId;
	}

	public void setfId(int fId) {
		this.fId = fId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return ", FACULTY ID= " + fId + ", FACULTY NAME= " + fName +  course;
	}
	

	
	
}
