import java.util.Scanner;

import javax.crypto.spec.IvParameterSpec;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		VietnamesePhone vp = new VietnamesePhone();
		System.out.println("1.insert\n2.remove\n3.update\n4.show\n5.thoát ra màn hình");
		while (true) {
			System.out.println("mời bạn nhâp số: ");
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				vp.insertContact();
				break;
			case 2:
				vp.removeContact();
				break;
			case 3:
				vp.updateContact();
				break;
			case 4:
				vp.searchContact();
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
