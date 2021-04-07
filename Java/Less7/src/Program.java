import java.util.ArrayList;

public class Program {
	public static void main(String[] args) {
		Student student1 = new Student(1, "Nguyễn Văn A");
		Student student2 = new Student(2, "Nguyễn Văn B");
		Student student3 = new Student(3, "Nguyễn Văn C");
		ArrayList<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		for (int i = 0; i < students.size(); i++) {
			students.get(i).showInfo();
		}
		System.out.println("chuyển đại học");
		student1.college = "đại học công nghệ";
		System.out.println("số tiền còn lại: " + Student.moneyGroup);
		System.out.println("số tiền còn lại khi student1 lấy đi 50: "+ (Student.moneyGroup - 50));
		System.out.println("số tiền còn lại khi student1 lấy đi 20: "+ (Student.moneyGroup - 20));
		System.out.println("số tiền còn lại khi student1 lấy đi 150: "+ (Student.moneyGroup - 150));
	}
}
