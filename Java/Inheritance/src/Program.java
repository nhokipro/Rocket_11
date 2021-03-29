import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		QLCB qlcb = new QLCB();
		System.out.println(
				"1.Thêm mới cán bộ.\n" + "2.Tìm kiếm theo họ tên.\n3.Hiện thị thông tin về danh sách các cán bộ."
						+ "\n4.Nhập vào tên của cán bộ và delete cán bộ đóe.\n5.Thoát khỏi chương trình.");
		while (true) {
			System.out.println("mời bạn nhâp số: ");
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				qlcb.themCanBo();
				break;
			case 2:
				qlcb.timKiemCanBo();
				break;
			case 3:
				qlcb.hienThiThongTinCanBo();
				break;
			case 4:
				qlcb.deleteCanBo();
				break;
			case 5:
				System.out.println("thoát ra khỏi chương trình");
				return;

			default:
				break;
			}
		}
	}

}
