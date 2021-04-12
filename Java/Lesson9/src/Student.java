
public class Student {

	private int id;
	private String name;
	private static int count = 1;

	public Student(String name) {
		super();
		this.id = count++;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	/**
	 * @deprecated replace by {@link #getIdv2()}
	 */
	public int getId() {
		return id;
	}

	public String getIdv2() {
		return "MSV" + id;
	}
}
