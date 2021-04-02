package frontend;

import java.util.Scanner;

import backend.Person;
import entity.InvalidAgeException;

public class Program {
	public static void main(String[] args) {
		Person a = new Person();
		Scanner scanner = new Scanner(System.in);
//		System.out.println(a.getAge());
//		try {
//			a.Abc();
//		} catch (Exception e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		System.out.println("mời người dùng nhập vào tuổi: ");
		while (true) {
			try {
				a.setAvg(a.getAge());
			} catch (InvalidAgeException e) {
				// TODO Auto-generated catch block
				System.out.println("xảy ra ngoại lệ");
				System.out.println();
				System.out.println(e.getMessage());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("xảy ra ngoại lệ");
//				System.out.println(e.getMessage());

			}
			System.out.print("nhập lại tuổi: ");
		}
	}
}
