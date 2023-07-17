package chap_10;

public class _01_AnonymousClass1 {
	public static void main(String[] args) {
		// 익명 클래스
		Coffee c1 = new Coffee();
		c1.order("아메리카노");

		System.out.println("-----------------");

		Coffee c2 = new Coffee();
		c1.order("라떼");

		System.out.println("-----------------");

		// 지인 방문
		// 똑같은 클래스를 사용하여 객체를 생성하는데 해당 메소드의 기능을 확장(오버라이드)
		// 단 specialCoffee 라는 객체 하나만을 위함
		Coffee specialCoffee = new Coffee() {
			@Override
			public void order(String coffee) {
				super.order(coffee);
				System.out.println("서비스+++");
			}

			@Override
			public void returnTray() {
				System.out.println("자리에 두시면 치우겠습니다.");
			}
		};
		specialCoffee.order("라떼");
		specialCoffee.returnTray();
		
	}	
}

class Coffee {
	public void order(String coffee) {
		System.out.println("주문하신 " + coffee + " 나왔습니다.");
	}

	public void returnTray() {
		System.out.println("커피 반납 완료.");
	}
}