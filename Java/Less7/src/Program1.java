import java.nio.file.attribute.AclEntry;
import java.util.ArrayList;

public class Program1 {
	public static void main(String[] args) {
		ArrayList<PrimaryStudent> primaryStudents = new ArrayList<>();
		PrimaryStudent primaryStudent1 = new PrimaryStudent(1, "a");
		PrimaryStudent primaryStudent2 = new PrimaryStudent(2, "b");
		PrimaryStudent primaryStudent3 = new PrimaryStudent(3, "h");
		primaryStudents.add(primaryStudent1);
		primaryStudents.add(primaryStudent2);
		primaryStudents.add(primaryStudent3);
		SecondaryStudent secondaryStudent1 = new SecondaryStudent(3, "c");
		SecondaryStudent secondaryStudent2 = new SecondaryStudent(4, "d");
		SecondaryStudent secondaryStudent3 = new SecondaryStudent(5, "e");
		SecondaryStudent secondaryStudent4 = new SecondaryStudent(6, "f");
		System.out.println("số lượng primary student: " + PrimaryStudent.count1);
		System.out.println("số lượng secondary student: " + SecondaryStudent.count2);
//		if (PrimaryStudent.count1 > 2) {
//			for (int i = 2; i < primaryStudents.size(); i++) {
//				primaryStudents.remove(i);
//			}
		System.out.println(primaryStudents.size());
		try {
			Exception(primaryStudents);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			for (int i = 2; i < primaryStudents.size(); i++) {
				primaryStudents.remove(i);
			}
		}
		System.out.println(primaryStudents.size());
	}

	public static void Exception(ArrayList<PrimaryStudent> primaryStudents) throws java.lang.Exception {
		if (primaryStudents.size() > 2) {
			String msg = "quá bộ nhớ";
			throw new Exception(msg);
		}
	}
}
