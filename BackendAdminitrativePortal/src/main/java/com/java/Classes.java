package com.java;

public class Classes {
	private int id;
	private int section;
	private String teacher;
	private String subject;



	public Classes(int id, int section, String teacher, String subject) {
		super();
		this.id = id;
		this.section = section;
		this.teacher = teacher;
		this.subject = subject;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSection() {
		return section;
	}
	public void setSection(int section) {
		this.section = section;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}



	public static void forName(String string) {
		// TODO Auto-generated method stub

	}



}