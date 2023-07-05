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
		// 제네릭 클래스
		
		CoffeeByNumber c1 = new CoffeeByNumber(33);
		c1.ready();
		CoffeeByNickname c2 = new CoffeeByNickname("유재석");
		c2.ready();
		// Number, Nickname 클래스는 각각 int, String 만 들어갈 수 있다.
		System.out.println("-------------------------");
		
		CoffeeByName c3 = new CoffeeByName(34);
		c3.ready();
		CoffeeByName c4 = new CoffeeByName("박명수");
		c4.ready();
		// Object 를 매개변수로 가지는 ByName 은  타입에 상관없이 가능하다.
		// 하지만 객체의 매개변수를 꺼내올때는 형변환이 필요하다.
		System.out.println("-------------------------");
		
		int c3Name = (int) c3.name; // 정수값이 입력되어야 하므로 객체를 int 로 형변환
		System.out.println("주문 고객 번호 : " + c3Name);
		String c4Name = (String) c4.name;
		System.out.println("주문 고객 이름 : " + c4Name);
		
		// c4Name = (String) c3.name;
		
		System.out.println("-------------------------");
		// <> 에 어떤 자료형을 사용할 것인지 넣어주기
		Coffee<Integer> c5 = new Coffee<>(35);
		c5.ready();
		int c5Name = c5.name;
		// 이미 Integer 형이라고 정의 했으므로 형변환이 필요 없다.
		System.out.println("주문 고객 번호 : " + c5Name);
		
		Coffee<String> c6 = new Coffee<>("조새호");
		c6.ready();
		String c6Name = c6.name;
		System.out.println("주문 고객 이름 : " + c6Name);
		
		System.out.println("-------------------------");
		
		CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("이명박"));
		c7.ready();
		CoffeeByUser<VipUser> c8 = new CoffeeByUser<>(new VipUser("문재인"));
		c8.ready();
		
		System.out.println("-------------------------");

		orderCoffee("윤석열");
		orderCoffee(37);
		orderCoffee("이재명","아메리카노");
		orderCoffee(162, "아샷추");
				
	}
	
	public static <T> void orderCoffee(T name) {
		System.out.println("커피 준비 완료 : " + name);
	}
	
	// 여러 값을 전달받는 제네릭메소드
	public static <T, V> void orderCoffee(T name, V coffee) {
		System.out.println(coffee + " 준비 완료 : " + name);
	}

}


