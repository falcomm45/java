package _06_23;

public class Account {

	private String owner;

	private long balance; // �ܾ�

	void setOwner(String owner) {
		this.owner = owner;
	}

	String getOwner() {
		return owner;
	}

	void setBalance(long balance) {
		this.balance = balance;
	}

	Long getBalance() {
		return balance;
	}

	Account() {
	}

	Account(String owner) {
		this.owner = owner;
	}

	Account(long balance) {
		this.balance = balance;
	}

	Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}

	public long deposit(long amount) {
		balance += amount;
		return balance;
	}

	public void withdraw(long amount) {
		if (amount > balance) {
			System.out.println("�ܾ��� �����մϴ�. ���� �ܾ� : " + getBalance());
		} else {
			balance -= amount;
		}
	}

}
