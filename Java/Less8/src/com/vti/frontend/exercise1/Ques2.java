package com.vti.frontend.exercise1;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ques2 {
	public static void main(String[] args) {
		//ArrayList<String> student = new ArrayList<>();
		//Stack();
		Queue();
	}

	public static void Stack() {
		Stack<String> student = new Stack<>();
		student.push("nguyễn văn nam");
		student.push("nguyễn văn huyên");
		student.push("trần văn nam");
		student.push("nguyễn văn a");
		for (int i = 0; i < 4; i++) {
			System.out.println(student.pop());
		}
	}

	public static void Queue() {
		Queue<String> student = new LinkedList<>();
		student.add("nguyễn văn nam");
		student.add("nguyễn văn huyên");
		student.add("trần văn nam");
		student.add("nguyễn văn a");
		System.out.println(student.poll());
		System.out.println(student.poll());
		System.out.println(student.poll());
		System.out.println(student.poll());
	}
}
