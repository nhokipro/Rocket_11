package com.vti.frontend.exercise1;

import com.vti.backend.Exercise1.StudentManager;

public class program {
	public static void main(String[] args) {
		StudentManager a = new StudentManager();
		a.addStudent();
		a.addFirst();
		a.addLast();
//		a.reverseArray();
//		try {
//			a.searchByID();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}
//		a.searchByName();
//		a.deleteName();
		a.output();
	}
}
