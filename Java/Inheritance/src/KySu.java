import java.util.Scanner;

public class KySu extends CanBo {
	private String NganhDaoTao;
	private Scanner scanner;

	public KySu() {
		super();
		scanner = new Scanner(System.in);
	}

	public void inputKySu() {
//		super.inputCanBo();
		System.out.print("nhập ngành đào tạo : ");
		NganhDaoTao = scanner.nextLine();
	}
}
