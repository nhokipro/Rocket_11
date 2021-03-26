package com.vti.entity;

import java.time.LocalDate;

public class Group {
	private int id;
	private String name;
	private Account[] accounts;
	private LocalDate createDate;

	public Group() {

	}
	
	
	public Group(int id, String name, Account[] accounts, LocalDate createDate) {
		super();
		this.id = id;
		this.name = name;
		this.accounts = accounts;
		this.createDate = createDate;
	}
	

	public Group(int id, String name, String[] usernames, LocalDate createDate) {
		super();
		this.id = id;
		this.name = name;
		Account[] accounts = new Account[usernames.length];
		for (int i = 0; i < usernames.length; i++) {
			accounts[i] = new Account(usernames[i]);
		}
		this.createDate = createDate;
	}


	public int getId(int id) {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName(String name) {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getcreateDate(LocalDate createDate) {
		return createDate;
	}

	public void setcreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
}
