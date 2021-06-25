package com.student.manage;

public class Student {
	private int id;
	private String sname;
	private String sphone;
	private String scity;
	public Student() {
		super();
	}
	public Student(String sname, String sphone, String scity) {
		super();
		this.sname = sname;
		this.sphone = sphone;
		this.scity = scity;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", sname=" + sname + ", sphone=" + sphone + ", scity=" + scity + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSphone() {
		return sphone;
	}
	public void setSphone(String sphone) {
		this.sphone = sphone;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	public Student(int id, String sname, String sphone, String scity) {
		super();
		this.id = id;
		this.sname = sname;
		this.sphone = sphone;
		this.scity = scity;
	}

}
