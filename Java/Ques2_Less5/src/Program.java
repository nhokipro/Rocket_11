import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		TuyenSinh a = new TuyenSinh();
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"1.Thêm học sinh" + "\n2.In toàn bộ thí sinh" + "\n3.Tìm số bao danh" + "\n4.Thoát khỏi chương trình");
		while (true) {
			System.out.print("mời bạn nhập số: ");
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				a.addThiSinh();
				break;
			case 2:
				a.showInfo();
				break;
			case 3:
				a.searchSBD();
				break;
			case 4:
				System.out.println("thoát khỏi chương trình");
				return;
			default:
				break;
			}
		}
	}
}
