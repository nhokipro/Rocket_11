import java.util.Scanner;

public class abc {
	public static void main(String[] args) {
		int[] s = new int[16];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 16; i++) {
			s[i] = input.nextInt();
		}
		for (int i = 0; i < 16; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(s[4*i+j]);
			}
			System.out.println();
		}
	}
}