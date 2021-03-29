import java.util.Scanner;

public class CanBo {
	protected String name;
	protected int age;
	protected boolean sex;
	protected String address;
	private Scanner scanner;

	public CanBo() {
		scanner = new Scanner(System.in);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean isSex() {
		return sex;
	}

	public String getAddress() {
		return address;
	}

	public Scanner getScanner() {
		return scanner;
	}

	public CanBo(String name, int age, boolean sex, String address) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.address = address;

	}

	public void inputCanBo() {
		System.out.println("nhập tên: ");
		name = scanner.nextLine();
		System.out.println("nhập tuổi: ");
		age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("nhập giới tính: ");
		String s = scanner.nextLine();
		sex = s.equals("nam") ? true : false;
		System.out.println("nhập dịa chỉ: ");
		address = scanner.nextLine();
	}
}
