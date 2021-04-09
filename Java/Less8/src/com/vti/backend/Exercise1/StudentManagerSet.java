package com.vti.backend.Exercise1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.vti.entity.exercise1.Student;

public class StudentManagerSet {
	private Set<Student> students;

	public StudentManagerSet() {
		super();
		students = new TreeSet<>();
	}

	public void addStudent() {
		students.add(new Student("a"));
		students.add(new Student("b"));
		students.add(new Student("d"));
		students.add(new Student("c"));
	}

	public void output() {
		for (Student student : students) {
			System.out.println(student.getId());
			System.out.println(student.getName());
		}
	}
	public void outputName() {
		for (Student student : students) {
			System.out.println(student.getId());
			System.out.println(student.getName());
		}
	}
	
}
