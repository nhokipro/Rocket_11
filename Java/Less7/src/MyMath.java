
public class MyMath {
	static double a;
	static double b;

	public static double min() {
		double min = a;
		if (a > b) {
			min = b;
		}
		return min;
	}

	public static double sum() {
		return a + b;
	}
}
