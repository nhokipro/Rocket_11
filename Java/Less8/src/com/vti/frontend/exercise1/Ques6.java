package com.vti.frontend.exercise1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import com.vti.entity.exercise1.Student;

public class Ques6 {
	public static void main(String[] args) {
		TreeMap<Integer, Student> students  = new TreeMap<>();
		
		students.put(1, new Student("a"));
		students.put(2, new Student("b"));
		students.put(3, new Student("d"));
		students.put(4, new Student("c"));
		System.out.println(students.keySet());
		System.out.println(students.values());
		
		Set<Student> sets = new HashSet<Student>(students.values());
		for (Student student : sets) {
			System.out.println(student);
		}
	}
}
