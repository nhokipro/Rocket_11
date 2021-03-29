import java.util.Scanner;

public class NhanVien extends CanBo {
	private String congViec;
	private Scanner scanner;

	public NhanVien() {
		super();
		scanner = new Scanner(System.in);
	}

	public String getCongViec() {
		return congViec;
	}

	public void inputNhanVien() {
//		super.inputCanBo();
		System.out.print("nhập công việc: ");
		congViec = scanner.nextLine();

	}
}
