import java.util.ArrayList;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Student a = new Student();
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<>();
		System.out.println("nhập số học sinh: ");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			a.inputInfo();
			students.add(a);
		}
		for (int i = 0; i < students.size(); i++) {
			students.get(i).showInfo();
		}
		for (int i = 0; i < students.size(); i++) {
			if (a.isXet(students.get(i).getAvg()) == true) {
				System.out.println("học sinh được học bổng");
			} else
				System.out.println("không được");
		}
	}
}
