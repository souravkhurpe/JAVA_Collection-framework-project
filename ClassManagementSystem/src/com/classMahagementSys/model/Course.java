package com.classMahagementSys.model;

public class Course {
	
	private int cid;
	private String cname;
	
	
	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	@Override
	public String toString() {
		return ", COURSE ID=" + cid + ", COURSE NAME= " + cname ;
	}
	

}
