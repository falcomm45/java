package chap_12.clean;

public class Room {
	
	public int number = 1;
	
	synchronized public void clean(String name) {
		// ���� 1: 3���� û�� �Ϸ�
		System.out.println(name + " : " + number + "�� �� û�� ��");
		number++;
	}
}
