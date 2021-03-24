import java.util.Scanner;

public class abc { 
	public static void main(String[] args) {
		int[] s = new int[50]; 
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 16; i++) {
			s[i] = input.nextInt();
		}
		for (int i = 0; i < 16; i++) {
			System.out.print(s[i] + " ");
			if (i == 3 || i == 7 || i == 11) {
				System.out.println();
			}
		}
	}
}
