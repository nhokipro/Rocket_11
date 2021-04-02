package com.vti.backend;

import java.util.Scanner;

public class ScannerUtils {
	private static Scanner scanner;

	public ScannerUtils() {
		super();
		scanner = new Scanner(System.in);
	}
	public static int inputInt(String errorMessage) throws Exception {
		int s;
		while(true) {
			try {
				return s = scanner.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
				throw new Exception("errorMessage");
			}
		}
	}
	public float inputFloat(String errorMessage) throws Exception {
		while(true) {
			try {
				return Float.parseFloat(scanner.nextLine().trim());
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("errorMessage");
			}
		}
	}
	public double inputDouble(String errorMessage) throws Exception {
		while(true) {
			try {
				return Double.parseDouble(scanner.nextLine().trim());
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("errorMessage");
			}
		}
	}
	public static String inpuString(String errorMessage) throws Exception {
		String input;
		while(true) {
			try {
				return input = scanner.nextLine().trim();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("errorMessage");
			}
		}
	}
}
