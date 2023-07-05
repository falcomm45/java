package _06_23;

public class AccountExample {
	
	public static void main(String[] args) {
		
		Account acc = new Account("임형택", 80000000);
		System.out.println("임형택님 계좌에 입금합니다. 현재 잔액 : " + acc.getBalance());
		acc.deposit(8000000);
		System.out.println("입금 완료. 현재 잔액 : " + acc.getBalance());
		System.out.println("임형택님 계좌에서 출금합니다. 현재 잔액 : " + acc.getBalance());
		acc.withdraw(555000000);
		System.out.println("현재 잔액 : " + acc.getBalance());
	}
}
