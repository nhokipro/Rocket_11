import java.util.Random;
import java.util.Scanner;

public class Extra {
	public static void main(String[] args) {
//		Ques1();
		Ques2();
		Ques3();
		System.out.println(Ques4());
		StringToInt();
		Ex4_ques1();
		Ex4_ques2();
	}

// ques 1
	public static void Ques1() {
		float salary1 = 5240.5f;
		float salary2 = 10970.065f;
		int a = (int) salary1;
		int b = (int) salary2;
		System.out.println(b);
	}

// ques 2
	public static void Ques2() {
		Random random = new Random();
		int x = random.nextInt(100000);
		String s = String.valueOf(x);
		if (s.length() < 5) {
			for (int i = 0; i < 5 - s.length(); i++) {
				s = "0" + s;
			}
		}
		System.out.println(s);
	}

// ques 3
	public static void Ques3() {
		Random random = new Random();
		int x = random.nextInt(100000);
		String s = String.valueOf(x);
		if (s.length() < 5) {
			for (int i = 0; i < 5 - s.length(); i++) {
				s = "0" + s;
			}
		}
		String last = s.substring(3);
		System.out.println(last);
	}
//ques 4
	public static float Ques4() {
		float a = 1f;
		float b = 2f;
		return a/b;
	}
// ex2
// ques 1
// khai bao newAccount trong vòng for
// ex3
// ques 2
	public static void StringToInt() {
		String s = "123456";
		int m = Integer.parseInt(s);
		System.out.println(s);
	}
//ex 4
// ques 1 
	public static void Ex4_ques1() {
		String s = "cao hung   son";
		String[] word = s.split("\\s+");
		System.out.println("so tu la: " + word.length);
		
	}
// ques 3
	public static void Ex4_ques2() {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		s = s.trim();
		String[] word = s.split("\\s");
		for (int i = 0; i < word.length; i++) {
			word[i] = word[i].substring(0, 1).toUpperCase() + word[i].substring(1);
		}
		for (String m : word) {
			System.out.print(m + " ");
		}
	}
// ques 4
	public static void Ex4_ques4() {
		
	}
}