package _06_19;

import java.util.Scanner;

public class Account {
	private String owner;
	private long balance;
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public long getBalance() {
		return balance;
	}
	
	public Account(String owner, long balance) {
		setOwner(owner);
		setBalance(balance);
	}
	
	public long deposit(long amount) {
		System.out.println(amount + "���� �Ա��մϴ�.");
		return this.balance += amount;
	}
	
	public long withdraw(long amount) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ܾ��� " + this.balance + "�� �Դϴ�.");
		System.out.println(amount + "���� �����մϴ�.");
		if (this.balance<amount) {
			System.out.println("�ܾ��� �����մϴ�.\n�ܾ��� ��� ����Ͻðڽ��ϱ�?");
			String[] se = {"y", "n"};
			String answer = sc.next();
			if (se[0].equals(answer)) {
				System.out.println(this.balance+"���� �����մϴ�.");
				return 0;
			} else {
				System.out.println("������ ����մϴ�.");
				return this.balance;
			}
		} else {
			System.out.println(amount + "���� ����մϴ�.");
			return this.balance -= amount;
		}
	}
	
	public static void main(String[] args) {
		Account player = new Account("������", 2000000);
		player.deposit(3000000);
		player.withdraw(8000000);
	}
}
