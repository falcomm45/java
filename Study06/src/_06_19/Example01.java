package _06_19;
// ���θ��� �ֹ��� ���Խ��ϴ�. �ֹ� ������ ������ �����ϴ�.

// �ֹ���ȣ : 201907210001
// �ֹ��� ���̵� : abc123
// �ֹ� ��¥ : 2019�� 7�� 21��
// �ֹ��� �̸� : ȫ���
// �ֹ� ��ǰ ��ȣ : PD-345-12
// ��� �ּ� : ����� �������� ���ǵ��� 20����

// �� �ֹ� ������ ������ �� �ִ� Ŭ������ ����� �ν��Ͻ��� ������ �� ���� ���� �������� ����غ�����.


public class Example01 {
	public static void main(String[] args) {
		Order order = new Order("201907210001", "abc123", "2019�� 7�� 21��", "ȫ���", "PD-345-12", "����� �������� ���ǵ��� 20����");
		order.order();
	}

}

class Order {
	
	private String orderNumber;
	
	private String id;
	
	private String orderDate;
	
	private String name;
	
	private String productNumber;
	
	private String address;
	
	public Order(String orderNumber, String id, String orderDate, String name, String productNumber, String address) {
		this.orderNumber = orderNumber;
		this.id = id;
		this.orderDate = orderDate;
		this.name = name;
		this.productNumber = productNumber;
		this.address = address;
	}
	
	
	
	public void order () {
		System.out.println("�ֹ� ��ȣ : " + orderNumber);
		System.out.println("�ֹ��� ���̵� : " + id);
		System.out.println("�ֹ� ��¥ : " + orderDate);
		System.out.println("�ֹ��� �̸� : " + name);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + productNumber);
		System.out.println("��� �ּ� : " + address);
	}
	
}
