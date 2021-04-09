package com.vti.backend.exercise3;

import java.util.ArrayList;

import com.vti.entity.exercise3.Student;

public class Generic {
	public void Ques1() {
		Student<Integer> a = new Student<>(1, "sơn");
		Student<Float> b = new Student<>(1.2f, "sơn");
		Student<Double> c = new Student<>((double) 3, "sơn");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public void Ques4() {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		ArrayList<Float> b = new ArrayList<>();
		b.add(1f);
		b.add(2f);
		b.add(3f);
		b.add(4f);
		ArrayList<Double> c = new ArrayList<>();
		c.add(1.2);
		c.add(2.1);
		c.add(3.4);
		c.add(4.5);
	}
	public <T> void printArray (ArrayList<T> list) {
		for (T t : list) {
			System.out.println(t);
		}
	}
	
}
