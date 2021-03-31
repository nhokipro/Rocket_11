import java.util.Scanner;

public class KhoiB extends ThiSinh {
	private String[] monHoc = new String[] { "toán", "sinh", "hóa" };
	private float toan;
	private float sinh;
	private float hoa;
	private String Khoi = "B";
	private Scanner scanner;

	public String Khoi() {
		return Khoi;
	}

	public float getToan() {
		return toan;
	}

	public float getSinh() {
		return sinh;
	}

	public float getHoa() {
		return hoa;
	}

	public Scanner getScanner() {
		return scanner;
	}

	public KhoiB() {
		super();
		scanner = new Scanner(System.in);
	}

	@Override
	public void input() {
		super.input();
//		for (String s : monHoc) {
//			System.out.println(s);
//		}
		System.out.print("nhập điểm toán: ");
		toan = scanner.nextFloat();
		System.out.print("nhập điểm sinh: ");
		sinh = scanner.nextFloat();
		System.out.print("nhập điểm hóa: ");
		hoa = scanner.nextFloat();
	}

	@Override
	public void output() {
		super.output();
		System.out.println("học sinh khối " + getKhoi());
		System.out.print("môn học trong khối: ");
		for (String s : monHoc) {
			System.out.print(s + " ");
		}
		System.out.println("điểm toán: " + getToan());
		System.out.println("điểm sinh: " + getSinh());
		System.out.println("điểm hóa: " + getHoa());
	}
}
