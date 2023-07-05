package _06_23;

public class Account {

	private String owner;

	private long balance; // 잔액

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
			System.out.println("잔액이 부족합니다. 현재 잔액 : " + getBalance());
		} else {
			balance -= amount;
		}
	}

}
