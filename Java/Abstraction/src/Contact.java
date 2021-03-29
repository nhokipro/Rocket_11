import java.util.Scanner;

public abstract class Contact {
	protected String name;
	protected String number;
	private Scanner scanner;
	public Contact() {
		scanner = new Scanner(System.in);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}
	public void input() {
		System.out.println("nhập tên; ");
		name = scanner.nextLine();
		System.out.println("nhập số điện thoại");
		number = scanner.nextLine();
	}
}
