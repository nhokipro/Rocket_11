
public final class PrimaryStudent extends Student{
	Student a = new PrimaryStudent(2, "sơn");
	public PrimaryStudent(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}
	public void primaryStudentStudy() {
		a.study();
	}
	
}
