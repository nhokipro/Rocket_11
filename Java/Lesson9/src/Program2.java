
public class Program2 {

	public static void main(String[] args) {
		Car a = new Car("Mazda", "8WD");
		Car.Engine engine =  a.new Engine("Crysler");
		System.out.println(a);
		System.out.println(engine);
	}

}
