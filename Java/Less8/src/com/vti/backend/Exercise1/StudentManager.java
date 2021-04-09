package com.vti.backend.Exercise1;

import java.util.ArrayList;
import java.util.Collections;

import com.vti.backend.ScannerUtils;
import com.vti.entity.exercise1.Student;

public class StudentManager {

	private ArrayList<Student> students;

	public StudentManager() {
		super();
		students = new ArrayList<>();
	}

	public void addStudent() {
		students.add(new Student("sơn"));
		students.add(new Student("sơn"));
		students.add(new Student("sơn"));
		students.add(new Student("abc"));
	}

	public void output() {
		for (int i = 0; i < students.size(); i++) {
			System.out.println("thành viên thứ " + (i + 1));
			System.out.println("id: " + students.get(i).getId());
			System.out.println("id: " + students.get(i).getName());
		}
	}

	public void outputFirstAndLast() {
		System.out.println("phần tử đầu: " + students.get(0));
		System.out.println("id: " + students.get(0).getId());
		System.out.println("id: " + students.get(0).getName());
		System.out.println("phần tử cuối: " + students.get(students.size() - 1));
		System.out.println("id: " + students.get(students.size() - 1).getId());
		System.out.println("id: " + students.get(students.size() - 1).getName());
	}

	public void addFirst() {
		System.out.println("thêm phần tử vào đầu: ");
		students.add(0, new Student("bca"));
	}

	public void addLast() {
		System.out.println("thêm phần tử vào cuối: ");
		students.add((students.size()), new Student("cba"));
	}

	public void reverseArray() {
		Collections.reverse(students);
	}

	public void searchByID() throws Exception {
		System.out.println("nhập id cần tìm kiếm: ");
		ScannerUtils a = new ScannerUtils();
		int count1 = 0;
		int searchID = a.inputInt("lỗi");
		if (searchID < 0) {
			throw new Exception("lỗi");
		} else if (searchID > students.size()) {
			throw new Exception("lỗi");
		}
		for (int i = 0; i < students.size(); i++) {
			if (searchID == students.get(i).getId()) {
				System.out.println("id cần tìm");
				System.out.println(students.get(i).getId());
				System.out.println(students.get(i).getName());
				count1++;
			}
		}
		if (count1 == 0) {
			System.out.println("không có id cần tìm");
		}
	}

	public void searchByName() {
		System.out.println("nhập tên cần tìm: ");
		ScannerUtils a = new ScannerUtils();
		int count2 = 0;
		String searchName = a.inputString("lỗi");
		for (int i = 0; i < students.size(); i++) {
			if (searchName.equals(students.get(i).getName())) {
				System.out.println("name cần tìm");
				System.out.println(students.get(i).getId());
				System.out.println(students.get(i).getName());
				count2++;
			}
		}
		if (count2 == 0) {
			System.out.println("không có name cần tìm");
		}
	}

	public void deleteName() {
		students.remove(students.get(1).getName());
	}

	public void deleteStudent() {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId() == 5) {
				students.remove(i);
			}
		}
	}

	public void create() {
		ArrayList<Student> studentCopies = new ArrayList<>();
		studentCopies.addAll(students);
	}
}
