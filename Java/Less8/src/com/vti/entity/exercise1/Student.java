package com.vti.entity.exercise1;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private static int count = 1;

	public Student(String name) {
		super();
		this.id = count++;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Student other) {
		// TODO Auto-generated method stub
		return name.compareTo(other.name);
	}

}
