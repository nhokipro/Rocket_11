package com.vti.entity;

import java.time.LocalDate;

public class Account {
	int id;
	String email;
	String username;
	String fullname;
	Department department;
	Position position;
	LocalDate createDate;
	Group[] groups;

	Account() {

	}

	public Account(String username) {
		super();
		this.username = username;
	}

	public Account(int id, String email, String username, String firstName, String lastName) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullname = firstName + " " + lastName;
	}

	public Account(String email, String username, String firstName, String lastName, Position position) {
		this.email = email;
		this.username = username;
		this.fullname = firstName + " " + lastName;
		this.position = position;
		this.createDate = LocalDate.now();
	}

	public Account(int id, String email, String username, String firstName, String lastName, Position position,
			LocalDate createDate) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullname = firstName + " " + lastName;
		this.position = position;
		this.createDate = createDate;
	}

	public int setId(int id) {
		return id;
	}

	public void getId(int id) {
		this.id = id;
	}

	public String setEmail(String email) {
		return email;
	}

	public void getEmail(String email) {
		this.email = email;
	}

	public String setFullname(String fullname) {
		return fullname;
	}

	public void getFullname(String fullname) {
		this.fullname = fullname;
	}

	public Department setDepartment(Department department) {
		return department;
	}

	public void getDepartment(Department department) {
		this.department = department;
	}

	public Position setposition(Position position) {
		return position;
	}

	public void getposition(Position position) {
		this.position = position;
	}

	public LocalDate setcreateDate(LocalDate createDate) {
		return createDate;
	}

	public void getcreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
}
