import java.util.Scanner;

public class CongNhan extends CanBo {
	private int bac;
	private Scanner scanner;

	public CongNhan() {
		super();
		scanner = new Scanner(System.in);
	}

//	public CongNhan(String name, int age, boolean sex, String address, int bac) {
//		super(name, age, sex, address);
//		this.bac = bac;
//		scanner = new Scanner(System.in);
//	}

	public void inputCongNhan() {
//		super.inputCanBo();
		System.out.print("nhập bậc: ");
		bac = scanner.nextInt();

		while (bac > 10) {
			if (bac > 10) {
				System.out.print("mời nhập lại bậc: ");
				bac = scanner.nextInt();
			} else break;
		}
	}
}
