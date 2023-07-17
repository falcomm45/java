package chap_10;

public class _01_AnonymousClass1 {
	public static void main(String[] args) {
		// �͸� Ŭ����
		Coffee c1 = new Coffee();
		c1.order("�Ƹ޸�ī��");

		System.out.println("-----------------");

		Coffee c2 = new Coffee();
		c1.order("��");

		System.out.println("-----------------");

		// ���� �湮
		// �Ȱ��� Ŭ������ ����Ͽ� ��ü�� �����ϴµ� �ش� �޼ҵ��� ����� Ȯ��(�������̵�)
		// �� specialCoffee ��� ��ü �ϳ����� ����
		Coffee specialCoffee = new Coffee() {
			@Override
			public void order(String coffee) {
				super.order(coffee);
				System.out.println("����+++");
			}

			@Override
			public void returnTray() {
				System.out.println("�ڸ��� �νø� ġ��ڽ��ϴ�.");
			}
		};
		specialCoffee.order("��");
		specialCoffee.returnTray();
		
	}	
}

class Coffee {
	public void order(String coffee) {
		System.out.println("�ֹ��Ͻ� " + coffee + " ���Խ��ϴ�.");
	}

	public void returnTray() {
		System.out.println("Ŀ�� �ݳ� �Ϸ�.");
	}
}