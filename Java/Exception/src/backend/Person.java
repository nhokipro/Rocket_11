package backend;

import java.util.Scanner;

import entity.InvalidAgeException;

public class Person {
	private float age;
	private Scanner scanner;

	public Person() {
		super();
		scanner = new Scanner(System.in);
	}

	public float Age() {
		age = scanner.nextFloat();
		scanner.nextLine();
		return age;
	}

	public float getAge() {
		return age;
	}

	public void setAvg(float age) throws InvalidAgeException, Exception {
		try {
			Age();
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("wrong inputing! Please input an age as int, input again.");
			
		}
		if (getAge() < 0) {
			String msg = "Wrong inputing! The age must be greater than 0, please input again.";
			throw new InvalidAgeException(msg, age);

		}
	}
}
//	public void Abc() throws Exception {
//
//		try {
//			float a = Age();
//			scanner.close();
//		} catch (Exception e) {
//			// TODO: handle exception
//			throw new Exception("wrong inputing! Please input an age as int, input again.");
//		}
//	}
//}
