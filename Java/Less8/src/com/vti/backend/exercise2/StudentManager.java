package com.vti.backend.exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.vti.entity.exercise2.Student;

public class StudentManager {
	private ArrayList<Student> students;

	public StudentManager() {
		super();
		students = new ArrayList<>();
	}

	public void addStudent() {
		students.add(new Student(2, "b", "2020-11-4"));
		students.add(new Student(2, "b", "2020-11-3"));
		students.add(new Student(3, "c", "2020-11-5"));
		students.add(new Student(4, "f", "2020-11-6"));
		students.add(new Student(5, "e", "2020-11-7"));
	}

	public void output() {
		Collections.sort(students);
		for (Student student : students) {
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getDate());
		}
	}
}
