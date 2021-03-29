import java.util.Scanner;

public abstract class User {
	protected String name;
	protected double salary;
	private Scanner scanner;
	public User() {
		super();
		scanner = new Scanner(System.in);
	}
	
	public User(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public abstract double calculatePay();

	public void displayInfor() {
		System.out.println(name);
		System.out.println(salary);
	}
	public void importInfo() {
		System.out.println("nhập tên: ");
		name = scanner.nextLine();
		System.out.println("nhập lương: ");
		salary = scanner.nextDouble();
	}
}
