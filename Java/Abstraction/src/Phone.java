import java.util.ArrayList;

public abstract class Phone extends Contact {
	public ArrayList<Contact> contacts;
	
	public Phone() {
		super();
		contacts = new ArrayList<>();
	}
	public abstract void insertContact();
	public abstract void removeContact();
	public abstract void updateContact();
	public abstract void searchContact();
}
