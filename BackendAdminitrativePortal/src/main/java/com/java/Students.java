package com.java;

public class Students {

	private int id;
	private String name;

	public Students(int id, String name) {
		super();
		this.id = id;
		this.name = name;

	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;

	}


	@Override
	public String toString() {
		return "Students [id=" + id + ",name=" + name 
				+ "]";
	}


}
