import java.util.Scanner;

public class KhoiC extends ThiSinh {
	private String[] monHoc = new String[] { "văn", "sử", "địa" };
	private float van;
	private float su;
	private float dia;
	private String Khoi = "C";
	private Scanner scanner;

	public String Khoi() {
		return Khoi;
	}

	public float getVan() {
		return van;
	}

	public float getSu() {
		return su;
	}

	public float getDia() {
		return dia;
	}

	public Scanner getScanner() {
		return scanner;
	}

	public KhoiC() {
		super();
		scanner = new Scanner(System.in);
	}

	@Override
	public void input() {
		super.input();
//		for (String s : monHoc) {
//			System.out.println(s);
//		}
		System.out.print("nhập điểm văn: ");
		van = scanner.nextFloat();
		System.out.print("nhập điểm sử: ");
		su = scanner.nextFloat();
		System.out.print("nhập điểm địa: ");
		dia = scanner.nextFloat();
	}

	@Override
	public void output() {
		super.output();
		System.out.println("học sinh khối " + getKhoi());
		System.out.print("môn học trong khối: ");
		for (String s : monHoc) {
			System.out.print(s + " ");
		}
		System.out.println("điểm toán: " + getVan());
		System.out.println("điểm sinh: " + getSu());
		System.out.println("điểm hóa: " + getDia());
	}
}
