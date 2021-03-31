import java.util.ArrayList;
import java.util.Scanner;

public class Student implements IStudent {
	private int id;
	private String name;
	private int group;
	public ArrayList<Student> students;
	private Scanner scanner;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getGroup() {
		return group;
	}

	public Student() {
		super();
		scanner = new Scanner(System.in);
		students = new ArrayList<>();
	}

	public void input() {
		Student a = new Student();
		System.out.print("nhập id: ");
		a.id = scanner.nextInt();
		scanner.nextLine();
		System.out.print("nhập tên: ");
		a.name = scanner.nextLine();
		System.out.print("nhập group: ");
		a.group = scanner.nextInt();
		students.add(a);
	}

	public void output() {
		for (Student student : students) {
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getGroup());
		}
	}

	@Override
	public void diemDanh() {
		// TODO Auto-generated method stub
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).getName() + " điểm danh");
		}
	}

	@Override
	public void hocBai() {
		// TODO Auto-generated method stub
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getGroup() == 1) {
				System.out.println(students.get(i).getName() + " đang học bài");
			}
		}
	}

	@Override
	public void donVeSinh() {
		// TODO Auto-generated method stub
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getGroup() == 2) {
				System.out.println(students.get(i).getName() + " đi dọn vệ sinh");
			}
		}
	}
}
