
public class Account {
	String id;
	String name;
	int balance;

	public Account(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public int credit(int amount) {
		return amount;
	}

	public int debit(int amount) {
		return amount;
	}

	public void tranferTo(Account account, int amount) {
		System.out.println("Tranfer " + account + " to " + account.getName());
	}
}
