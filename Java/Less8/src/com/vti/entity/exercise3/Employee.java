package com.vti.entity.exercise3;

import java.util.ArrayList;

public class Employee<T> {

	private int id;
	private String name;
	private ArrayList<T> salaries;

	public Employee() {
		super();
		salaries = new ArrayList<T>();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salaries=" + salaries + "]";
	}

	public void print() {
		System.out.println(salaries.get(salaries.size() - 1));
	}

}
