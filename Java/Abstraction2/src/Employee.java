
public class Employee extends User {
	private double d;
	
	public Employee(double d) {
		super();
		this.d = d;
	}
	
	public Employee() {
		super();
	}

	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		Employee a = new Employee();
		d = a.getSalary() * 420;
		return d;
	}

}
