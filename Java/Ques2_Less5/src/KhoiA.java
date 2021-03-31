import java.util.Scanner;

public class KhoiA extends ThiSinh {
	private String[] monHoc = new String[] { "toán", "lý", "hóa" };
	private String Khoi = "A";
	private float toan;
	private float ly;
	private float hoa;
	private Scanner scanner;

	public String[] getMonHoc() {
		return monHoc;
	}

	public String getKhoi() {
		return Khoi;
	}

	public float getToan() {
		return toan;
	}

	public float getLy() {
		return ly;
	}

	public float getHoa() {
		return hoa;
	}

	public Scanner getScanner() {
		return scanner;
	}

	public KhoiA() {
		super();
		Khoi = "A";
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
		System.out.print("nhập điểm lý: ");
		ly = scanner.nextFloat();
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
		System.out.println("\nđiểm toán: " + getToan());
		System.out.println("điểm lý: " + getLy());
		System.out.println("điểm hóa: " + getHoa());
	}

}
