package com.vti.entity;

public class Student {
	private int id;
	private String name;
	private String hometown;
	private float score;

	public Student(int id, String name, String hometown) {
		this.id = id;
		this.name = name;
		this.hometown = hometown;
		this.score = 0;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	@Override
	public String toString() {
		String s;
		if (score < 4.0) {
			s = " hoc luc Yeu ";
		} else if (score > 4.0 && score < 6.0) {
			s = " hoc luc TB ";
		} else if (score > 6 && score <8.0) {
			s = "hoc luc kha";
		} else s = "hoc luc gioi";
		return "Student [id=" + id + ", name=" + name + ", hometown=" + hometown + ", grade=" + s + "]";
	}

}
