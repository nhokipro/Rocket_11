import java.util.ArrayList;

public class Student {
	private int id;
	private String name;
	public static String college = "Đại học bách khoa hà nội";
	public static int moneyGroup = 0;
	public static int count = 0;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		moneyGroup = moneyGroup + 100;
		count++;
	}

	public void showInfo() {
		System.out.println(id);
		System.out.println(name);
	}

	public static String getCollege() {
		return college;
	}

	public static void setCollege(String college) {
		Student.college = college;
	}
}
