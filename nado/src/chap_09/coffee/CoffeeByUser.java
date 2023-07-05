package chap_09.coffee;

import chap_09.user.User;
						// User Ŭ������ ��ӹ��� T�� ��߸� �Ѵ�.
public class CoffeeByUser <T extends User>{
	
	public T user;
	
	public CoffeeByUser(T user) {
		this.user = user;
	}
	
	public void ready() {
		System.out.println("Ŀ�� �غ� �Ϸ� : " + user.name);
		user.addPoint();
	}
	
}
