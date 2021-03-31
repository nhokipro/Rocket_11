import java.util.Scanner;

public class TuyenSinh extends ThiSinh implements ITuyenSinh {
	private Scanner scanner;

	public TuyenSinh() {
		super();
		scanner = new Scanner(System.in);
	}

	@Override
	public void addThiSinh() {
		System.out.println("1.Nhập thông tin học sinh khối A" + "\n2.Nhập thông tin học sinh khối B"
				+ "\n3.Nhập thông tin học sinh khối C");
		int choose = scanner.nextInt();
		switch (choose) {
		case 1:
			ThiSinh a = new KhoiA();
			a.input();
			thisinhs.add(a);
			break;
		case 2:
			ThiSinh b = new KhoiB();
			b.input();
			thisinhs.add(b);
			break;
		case 3:
			ThiSinh c = new KhoiC();
			c.input();
			thisinhs.add(c);
			break;

		default:
			break;
		}

	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		for (ThiSinh thiSinh : thisinhs) {
			thiSinh.output();
		}

	}

	@Override
	public void searchSBD() {
		// TODO Auto-generated method stub
		int count = 0;
		System.out.print("nhập số báo danh cần tìm: ");
		int searchSBD = scanner.nextInt();
		for (int i = 0; i < thisinhs.size(); i++) {
			if (thisinhs.get(i).getSBD() == searchSBD) {
				thisinhs.get(i).output();
				count++;
			}
		}
		if (count == 0) {
			System.out.println("không có SBD cần tìm");
		}
	}

}
