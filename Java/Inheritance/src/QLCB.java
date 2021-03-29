import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
	private ArrayList<CanBo> canbos;
	private Scanner scanner;

	public QLCB() {
		super();
		canbos = new ArrayList<>();
		scanner = new Scanner(System.in);
	}

	public void themCanBo() {
		System.out.println("bạn muốn thêm ngành nào: (1.công nhân) (2. nhân viên) (3.ki su)");
		int choose = scanner.nextInt();
		scanner.nextLine();
		switch (choose) {
		case 1:
			CongNhan employee = new CongNhan();
			employee.inputCanBo();
			employee.inputCongNhan();
			canbos.add(employee);
			System.out.println("thêm thành công");
			break;
		case 2:
			NhanVien employee1 = new NhanVien();
			employee1.inputCanBo();
			employee1.inputNhanVien();
			canbos.add(employee1);
			System.out.println("thêm thành công");
			break;
		case 3:
			KySu employee2 = new KySu();
			employee2.inputCanBo();
			employee2.inputKySu();
			canbos.add(employee2);
			System.out.println("thêm thành công");
			break;

		default:
			break;
		}
	}

	public void timKiemCanBo() {
		CanBo a = new CanBo();
		System.out.print("nhập tên tìm kiếm: ");
		String s = scanner.nextLine();
		int count = 0;
		for (int i = 0; i < canbos.size(); i++) {
			if (canbos.get(i).getName().equals(s)) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("ton tai " + count + " nguoi ten là: " + s);
		} else
			System.out.println("khong ton tai");
	}
	public void hienThiThongTinCanBo() {
		for (CanBo a : canbos) {
			System.out.println(a.getName());
			System.out.println(a.getAge());
			System.out.println(a.getAddress());
		}
	}
	public void deleteCanBo() {
		System.out.print("mời bạn nhập tên cán bộ cần xóa: ");
		String s = scanner.nextLine();
		CanBo a = new CanBo();
		for (int i = 0; i < canbos.size(); i++) {
			if (canbos.get(i).getName().equals(s)) {
				canbos.remove(i);
				System.out.println("xoa thanh cong");
			}
		}
	}
}