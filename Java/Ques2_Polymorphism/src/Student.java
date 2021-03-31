import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {
	private int id;
	private float avg;
	private String email;
	private Scanner scanner;

	public Student() {
		super();
		scanner = new Scanner(System.in);
	}
	@Override
	public void inputInfo() {
		super.inputInfo();
		System.out.print("nhập mã sinh viên: ");
		id = scanner.nextInt();
		System.out.print("nhập điểm trung bình: ");
		avg = scanner.nextFloat();
		System.out.print(" nhập email: ");
		email = scanner.nextLine();
		scanner.nextLine();
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("mã sinh viên: " + id);
		System.out.println("điểm trung bình: " + avg);
		System.out.println("email: " + email);
	}
	public boolean isXet(float avg) {
		if (avg > 8.0) {
			return true;
		}
		return false;
	}
	public float getAvg() {
		return avg;
	}
}
