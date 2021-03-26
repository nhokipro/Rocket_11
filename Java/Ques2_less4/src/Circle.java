
public class Circle {
	private double radius = 1.0;
	String color = "red";

	public Circle() {
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(String color) {
		super();
		this.color = color;
	}

	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}
}
