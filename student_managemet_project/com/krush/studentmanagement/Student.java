package com.krush.studentmanagement;

public class Student 
{
	private  int id;
	private String sname;
    public Student() {
		super();
		
	}
    
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", age=" + age + "]";
	}

	public Student(int id, String sname, int age) {
		super();
		this.id = id;
		this.sname = sname;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
    
    
}
