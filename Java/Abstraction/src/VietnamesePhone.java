import java.util.Scanner;

public class VietnamesePhone extends Phone {
	private Scanner scanner;

	public VietnamesePhone() {
		super();
		scanner = new Scanner(System.in);
	}

	@Override
	public void insertContact() {
		VietnamesePhone a = new VietnamesePhone();
		a.input();
		contacts.add(a);
		System.out.println("thêm thành công");
	}

	@Override
	public void removeContact() {
		// TODO Auto-generated method stub
		System.out.print("nhập tên cần xóa: ");
		String s = scanner.nextLine();
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getName().equals(s)) {
				contacts.remove(i);
				System.out.println("xóa thành công");
			} else System.out.println("ten khong hop le");
		}
	}

	@Override
	public void updateContact() {
		// TODO Auto-generated method stub
		System.out.print("nhập tên cần update sđt: ");
		String s = scanner.nextLine();
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getName().equals(s)) {
				System.out.print("nhập sđt update: ");
				String newNumber = scanner.nextLine();
				contacts.get(i).setNumber(newNumber);
				System.out.println("update thành công");
			} else System.out.println("không đúng tên");
		}
	}

	@Override
	public void searchContact() {
		// TODO Auto-generated method stub
		System.out.print("nhập tên cần tìm: ");
		String s = scanner.nextLine();
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getName().equals(s)) {
				System.out.println(contacts.get(i).getName());
				System.out.println(contacts.get(i).getNumber());
			}
		}
	}
	public void showArray() {
		System.out.println(contacts.size());
	}
}
