package com.vti.entity.exercise2;

public class Student implements Comparable<Student> {
	private Integer id;
	private String name;
	private String date;
	public Student(int id, String name, String date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDate() {
		return date;
	}
	@Override
	public int compareTo(Student other) {
		// TODO Auto-generated method stub
		name.compareTo(other.name);
		if(name.equals(other.name)) {
			date.compareTo(other.date);
			if(date.equals(other.date)) {
				id.compareTo(other.id);
			}
		}return 0;
	}
	
}
