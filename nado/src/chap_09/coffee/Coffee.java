package chap_09.coffee;

// ���׸� Ŭ����

public class Coffee <T>{
	public T name;
	
	public Coffee(T name) {
		this.name = name;
	}
	
	public void ready() {
		System.out.println("Ŀ�� �غ� �Ϸ� : " + name);
	}
}
