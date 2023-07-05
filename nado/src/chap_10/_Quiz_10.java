package chap_10;

import java.util.ArrayList;

/* �մ� �̸� �� ���� ������ ���� Customer Ŭ���� ����
 * ������ 1�δ� 5000������ ����
 * 20�� �̻��� �մԵ鿡�Ը� ����� �ΰ�(�� �� ����)
 * æ�鷯 50
 * ����ÿ 42
 * ���ī 21
 * ���ڹ� 18
 * ���ӽ� 5
 * 
 * map() �� �̿��Ͽ� ���ϴ� ���·� ���� 
 * ���׿����� ���
 */
public class _Quiz_10 {
	
	public static void main(String[] args) {
		
		ArrayList<Customer> list = new ArrayList<>();
		
		list.add(new Customer("æ�鷯", 50));
		list.add(new Customer("����ÿ", 42));
		list.add(new Customer("���ī", 21));
		list.add(new Customer("���ڹ�", 18));
		list.add(new Customer("���ӽ�", 5));
		System.out.println("�̼��� �����");
		System.out.println("---------");
		list.stream()
			.map(x -> x.age >= 20 ? x.name + " 5000��" : x.name + " ����")
			.forEach(System.out::println);
		
		
	}
	
	
}

class Customer {
	public String name;
	public int age;
	
	Customer() {}
	
	Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
}
