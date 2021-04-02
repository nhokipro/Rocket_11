package entity;

public class InvalidAgeException extends Exception {
	private float invalidAge;

	public InvalidAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvalidAgeException(String message, float invalidAge) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public float getInvalidAge() {
		return invalidAge;
	}
	
}	
