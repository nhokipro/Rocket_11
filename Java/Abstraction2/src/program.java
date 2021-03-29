
public class program {
	public static void main(String[] args) {
		Employee a = new Employee();
		Manager b = new Manager();
		Waiter c = new Waiter();
		a.importInfo();
		System.out.println(a.calculatePay());
	}
}
