import java.util.ArrayList;
import java.util.Scanner;

public abstract class ThiSinh {
	protected int SBD;
	protected String name;
	protected String address;
	protected String priority;
	protected String Khoi;
	protected ArrayList<ThiSinh> thisinhs;
	private Scanner scanner;

	public ThiSinh() {
		super();
		thisinhs = new ArrayList<>();
		scanner = new Scanner(System.in);
	}

	public int getSBD() {
		return SBD;
	}

	public String getKhoi() {
		return Khoi;
	}

	public void input() {
		System.out.print("nhập SBD: ");
		SBD = scanner.nextInt();
		scanner.nextLine();
		System.out.print("nhập name: ");
		name = scanner.nextLine();
		System.out.print("nhập address: ");
		address = scanner.nextLine();
		System.out.print("nhập priority: ");
		priority = scanner.nextLine();
	}

	public void output() {
		System.out.println("SBD là: " + SBD);
		System.out.println("tên là là: " + name);
		System.out.println("địa chỉ là: " + address);
		System.out.println("mức ưu tiên là: " + priority);
	}

}
