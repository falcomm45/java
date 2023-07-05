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
		System.out.println(amount + "원을 입금합니다.");
		return this.balance += amount;
	}
	
	public long withdraw(long amount) {
		Scanner sc = new Scanner(System.in);
		System.out.println("현재 잔액은 " + this.balance + "원 입니다.");
		System.out.println(amount + "원을 인출합니다.");
		if (this.balance<amount) {
			System.out.println("잔액이 부족합니다.\n잔액을 모두 출력하시겠습니까?");
			String[] se = {"y", "n"};
			String answer = sc.next();
			if (se[0].equals(answer)) {
				System.out.println(this.balance+"원을 인출합니다.");
				return 0;
			} else {
				System.out.println("인출을 취소합니다.");
				return this.balance;
			}
		} else {
			System.out.println(amount + "원을 출금합니다.");
			return this.balance -= amount;
		}
	}
	
	public static void main(String[] args) {
		Account player = new Account("임형택", 2000000);
		player.deposit(3000000);
		player.withdraw(8000000);
	}
}
