import java.util.Scanner;

public class Person {
	private String name;
	private String sex;
	private int birthDay;
	private String address;
	private Scanner scanner;

	public Person() {
		super();
		scanner = new Scanner(System.in);
	}

	public Person(String name, String sex, int birthDay, String address) {
		super();
		this.name = name;
		this.sex = sex;
		this.birthDay = birthDay;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public void inputInfo() {
		System.out.print("nhập tên: ");
		name = scanner.nextLine();
		System.out.print("nhập giới tính: ");
		sex = scanner.nextLine();
		System.out.print("nhập ngày sinh: ");
		birthDay = scanner.nextInt();
		System.out.print("nhập địa chỉ: ");
		address = scanner.nextLine();
		scanner.nextLine();
	}
	public void showInfo() {
		System.out.println("tên: " + name);
		System.out.println("giới tính: " + sex);
		System.out.println("ngày sinh: " + birthDay);
		System.out.println("địa chỉ: " + address);
	}
}
