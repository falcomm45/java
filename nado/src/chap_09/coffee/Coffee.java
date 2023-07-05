package chap_09.coffee;

// 제네릭 클래스

public class Coffee <T>{
	public T name;
	
	public Coffee(T name) {
		this.name = name;
	}
	
	public void ready() {
		System.out.println("커피 준비 완료 : " + name);
	}
}
