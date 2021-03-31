
public class Program {
	public static void main(String[] args) {
		Student a = new Student();

		int n = 1;
		while ( n < 4) {
			System.out.println("nhập học sinh thứ " + n + ": ");
			a.input();
			n++;
		}
		a.diemDanh();
//		System.out.println(a.students.size());
		a.donVeSinh();
		a.hocBai();
//		if(a.getGroup() == 1) {
//			a.donVeSinh();
//		}
	}
}
