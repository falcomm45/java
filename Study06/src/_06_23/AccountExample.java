package _06_23;

public class AccountExample {
	
	public static void main(String[] args) {
		
		Account acc = new Account("������", 80000000);
		System.out.println("�����ô� ���¿� �Ա��մϴ�. ���� �ܾ� : " + acc.getBalance());
		acc.deposit(8000000);
		System.out.println("�Ա� �Ϸ�. ���� �ܾ� : " + acc.getBalance());
		System.out.println("�����ô� ���¿��� ����մϴ�. ���� �ܾ� : " + acc.getBalance());
		acc.withdraw(555000000);
		System.out.println("���� �ܾ� : " + acc.getBalance());
	}
}
