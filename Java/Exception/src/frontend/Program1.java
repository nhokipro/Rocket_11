package frontend;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		input();
	}

	public static String MailException() throws Exception {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		if (s.length() < 5) {
			throw new Exception("lỗi");
		} else if (!s.contains("@")) {
			throw new Exception("lỗi");
		} else
			return s;
	}

	public static void input() {
		try {
			String s = MailException();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
