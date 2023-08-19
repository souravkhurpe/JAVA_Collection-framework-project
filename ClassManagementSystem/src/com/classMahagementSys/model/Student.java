package com.classMahagementSys.model;

public class Student {
	
	private int sId;
	private String sName;
	private Batch batch;
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Batch getBatch() {
		return batch;
	}
	public void setBatch(Batch batch) {
		this.batch = batch;
	}
	
	@Override
	public String toString() {
		return "STUDENT ID= " + sId + ", STUDENT NAME= " + sName +  batch;
	}
	
	

}
