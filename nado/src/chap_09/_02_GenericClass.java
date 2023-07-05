package chap_09;

import chap_09.coffee.Coffee;
import chap_09.coffee.CoffeeByName;
import chap_09.coffee.CoffeeByNickname;
import chap_09.coffee.CoffeeByNumber;
import chap_09.coffee.CoffeeByUser;
import chap_09.user.User;
import chap_09.user.VipUser;

public class _02_GenericClass {
	public static void main(String[] args) {
		// ���׸� Ŭ����
		
		CoffeeByNumber c1 = new CoffeeByNumber(33);
		c1.ready();
		CoffeeByNickname c2 = new CoffeeByNickname("���缮");
		c2.ready();
		// Number, Nickname Ŭ������ ���� int, String �� �� �� �ִ�.
		System.out.println("-------------------------");
		
		CoffeeByName c3 = new CoffeeByName(34);
		c3.ready();
		CoffeeByName c4 = new CoffeeByName("�ڸ��");
		c4.ready();
		// Object �� �Ű������� ������ ByName ��  Ÿ�Կ� ������� �����ϴ�.
		// ������ ��ü�� �Ű������� �����ö��� ����ȯ�� �ʿ��ϴ�.
		System.out.println("-------------------------");
		
		int c3Name = (int) c3.name; // �������� �ԷµǾ�� �ϹǷ� ��ü�� int �� ����ȯ
		System.out.println("�ֹ� �� ��ȣ : " + c3Name);
		String c4Name = (String) c4.name;
		System.out.println("�ֹ� �� �̸� : " + c4Name);
		
		// c4Name = (String) c3.name;
		
		System.out.println("-------------------------");
		// <> �� � �ڷ����� ����� ������ �־��ֱ�
		Coffee<Integer> c5 = new Coffee<>(35);
		c5.ready();
		int c5Name = c5.name;
		// �̹� Integer ���̶�� ���� �����Ƿ� ����ȯ�� �ʿ� ����.
		System.out.println("�ֹ� �� ��ȣ : " + c5Name);
		
		Coffee<String> c6 = new Coffee<>("����ȣ");
		c6.ready();
		String c6Name = c6.name;
		System.out.println("�ֹ� �� �̸� : " + c6Name);
		
		System.out.println("-------------------------");
		
		CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("�̸��"));
		c7.ready();
		CoffeeByUser<VipUser> c8 = new CoffeeByUser<>(new VipUser("������"));
		c8.ready();
		
		System.out.println("-------------------------");

		orderCoffee("������");
		orderCoffee(37);
		orderCoffee("�����","�Ƹ޸�ī��");
		orderCoffee(162, "�Ƽ���");
				
	}
	
	public static <T> void orderCoffee(T name) {
		System.out.println("Ŀ�� �غ� �Ϸ� : " + name);
	}
	
	// ���� ���� ���޹޴� ���׸��޼ҵ�
	public static <T, V> void orderCoffee(T name, V coffee) {
		System.out.println(coffee + " �غ� �Ϸ� : " + name);
	}

}


