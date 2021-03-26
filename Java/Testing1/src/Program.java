public class Program {
	public static void main(String[] args) {
		// create department
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Sale";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Marketting";

		// create group
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Java Fresher";

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "C# Fresher";

		// Create position
		Position position1 = new Position();
		position1.id = 1;
		position1.name = "Sale";

		Position position2 = new Position();
		position1.id = 2;
		position1.name = "Marketing";

		// Create account
//		Account account1 = new Account();
//		account1.id = 1;
//		account1.email = "haidnag@gmail.com";
//		account1.groups = new Group[] { group1, group2 };
//		account1.position = position1;
//		account1.department = department1;
//		account1.fullname = "Nguyễn Hải Đăng";
//		account1.createDate = LocalDate.now();
//		account1.username = "haidangproductions";
//
//		Account account2 = new Account();
//		account2.id = 2;
//		account2.email = "nguyenhaidang@gmail.com";
//		account2.groups = new Group[] { group1 };
//		account2.position = position2;
//		account2.department = department2;
//		account2.fullname = "Nguyễn Hải Đăng";
//		account2.createDate = LocalDate.now();
//		account2.username = "dangblack";

//		group1.accounts = new Account[] { account1, account2 };
//		Account[] accounts = new Account[] { account1, account2 };
//		Department departments[] = { department1, department2 };
//		for (int i = 0; i < accounts.length; i++) {
//			System.out.println("acc thu " + (i+1) + " là: ");
//			System.out.println("ID:" + accounts[i].id);
//			System.out.println("Email: " + accounts[i].email);
//		}
//		switch (group1.accounts.length) {
//		case 1:
//			System.out.println(" nhom co 1 thanh vien");
//			break;
//		case 2:
//			System.out.println(" nhom co 2 thanh vien");
//			break;
//		case 3:
//			System.out.println(" nhom co 3 thanh vien");
//			break;
//		default:
//			System.out.println();
//		}
//		for (int i = 1; i < 100; i++) {
//			System.out.println(2*i-1);
//		}
// ques 1
//		if (account2.department.name == null) {
//			System.out.println("nhan vien chua co phong ban");
//		} else System.out.println("phong ban cua nhan vien nay la: "+ account2.department.name);
// ques 2
//		if (account2.groups == null) {
//			System.out.println("nhan vien khong co trong group");
//		} else if (account2.groups.length == 1 || account2.groups.length == 2) {
//			System.out.println("Group cuar nhan vien laf java fresher, c# fresher");
//		} else if (account2.groups.length == 3) {
//			System.out.println("nhan vien laf nguoi quan trong");
//		} else if (account2.groups.length == 4) {
//			System.out.println("nhan vien laf nguoi hong chuyen");
//		}
//		switch (account2.groups.length) {
//		default:
//			System.out.println("nhan vien khong co trong group");
//			break;
//		case 1:
//			System.out.println("Group cuar nhan vien laf java fresher, c# fresher");
//			break;
//		case 2:
//			System.out.println("nhan vien laf nguoi quan trong");
//			break;
//		case 3:
//			System.out.println("nhan vien laf nguoi hong chuyen");
//			break;
//		}
// ques 3
//		String temp = null;
//		temp = (account2.department.name == null) ? "nhan vien chua co phong ban" : "phong ban cua nhan vien nay la: "+ account2.department.name;
//		System.out.println(temp);
// ques 4
//		String temp = null; 
//		temp = (account1.position.name == "dev") ? "day la dev " : "nguoi nay k phai la dev";
//		System.out.println(temp);
// ques 5
//		switch (group1.accounts.length) {
//		
//		case 1:
//			System.out.println("nhom co 1 thanh vien");
//			break;
//		
//		case 2:
//			System.out.println("nhom co 2 thanh vien");
//			break;
//		
//		case 3:
//			System.out.println("nhom co 3 thanh vien");
//			break;
//
//		default:
//			System.out.println("nhom co nhieu thanh vien");
//			break;
//		}
// ques 8
//		for (Account account : accounts) {
//			System.out.println(account.email);
//			System.out.println(account.fullname);
//			System.out.println(account.department.name);
//		}
// ques 9
//		Department departments[] = {department1, department2};
//		for (Department department : departments) {
//			System.out.println(department.id);
//			System.out.println(department.name);
//		}
// ques 12
//		for (int i = 0; i < 2; i++) {
//			System.out.println("thong tin department thu " + (i+1) + " : ");
//			System.out.println("id la: " + departments[i].id);
//			System.out.println("ten la: " + departments[i].name);
//		}
// ques 13 
//		for (int i = 0; i < accounts.length; i++) {
//			if (i == 1) {
//				continue;
//			}
//			System.out.println(accounts[i].id);
//			System.out.println(accounts[i].fullname);
//			System.out.println(accounts[i].email);
//			System.out.println(accounts[i].username);
//		}
// ques 14
//		for (int i = 0; i < 4; i++) {
//			
//			System.out.println(accounts[i].id);
//			System.out.println(accounts[i].fullname);
//			System.out.println(accounts[i].email);
//			System.out.println(accounts[i].username);
//		}
// ques 15
//		for (int i = 0; i <= 10; i++) {
//			System.out.println(2*i);
//		}
// ques 16
//		int i = 0;
//		while ( i < 2) {
//			System.out.println("thong tin department thu " + (i+1) + " : ");
//			System.out.println("id la: " + departments[i].id);
//			System.out.println("ten la: " + departments[i].name);
//			i++;
//		}
// ques 16
//		int i = 0;
//		while (i < accounts.length) {
//			if (i == 1) {
//				continue;
//			}
//			System.out.println(accounts[i].id);
//			System.out.println(accounts[i].fullname);
//			System.out.println(accounts[i].email);
//			System.out.println(accounts[i].username);
//			i++;
//		}
// ques 17
//		int i =0;
//		do {
//			System.out.println("thong tin department thu " + (i+1) + " : ");
//			System.out.println("id la: " + departments[i].id);
//			System.out.println("ten la: " + departments[i].name);
//			i++;
//		} while (i<2);
// ques 17
//		int i = 0;
//		do {
//			if (i == 1) {
//			continue;
//		}
//			System.out.println(accounts[i].id);
//			System.out.println(accounts[i].fullname);
//			System.out.println(accounts[i].email);
//			System.out.println(accounts[i].username);
//			i++;
//		} while (i < accounts.length);
// ex2
// ques 1
//		System.out.print("nhap i: ");
//		int i = input.nextInt();
//		System.out.printf(Locale.ITALY, "%d", i);
//		Random random = new Random();
//		int d = random.nextInt(10);
//		System.out.println(d);
//		String[] name = {"a", "b", "c", "d", "g", "h"};
//		Random random = new Random();
//		int i = random.nextInt(name.length);
//		System.out.println(name[i]);
//		int[] a = new int[3]; 
//		Scanner input = new Scanner(System.in);
//		for (int i = 0; i < 3; i++) {
//			System.out.println("so thu " + (i+1) + ": ");
//			a[i] = input.nextInt();
//		}
// ques 1
//		Scanner scanner = new Scanner(System.in);
//		Account[] accountss = new Account[10];
//		for (int i = 0; i < 5; i++) {	
//			accountss[i] = new Account();
//			accountss[i].fullname = scanner.nextLine();
//			accountss[i].email = scanner.nextLine();
//		}
//		for (int i = 0; i < 5; i++) {
//			System.out.println(accountss[i].fullname);
//			System.out.println(accountss[i].email);
//		}
//		String a = "sonnnnnn sonnn";
//		String b = "sonn s";
//		String word[] = a.split("\\s");
//		System.out.println(word.length);
//		System.out.println(a + b);
	}
	
}
