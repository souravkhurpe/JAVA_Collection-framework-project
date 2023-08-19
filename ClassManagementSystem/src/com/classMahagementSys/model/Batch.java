package com.classMahagementSys.model;

public class Batch {

	private int bID;
	private String bName;
	
	private Faculty faculty;

	public int getbID() {
		return bID;
	}

	public void setbID(int bID) {
		this.bID = bID;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	@Override
	public String toString() {
		return ", BATCH ID= " + bID + ", BATCH NAME= " + bName  + faculty ;
	}
	
	
}
