package chap_10;

public class _02_AnonymousClass2 {
	public static void main(String[] args) {
		
		HomeMadeBurger momsTouch = getMomsTouch();
		momsTouch.cook();
		
		System.out.println("-------------------");
		
		HomeMadeBurger broTouch = getBroTouch();
		broTouch.cook();
	}
	
	private static HomeMadeBurger getBroTouch() {
		return new HomeMadeBurger() {
			
			@Override
			public void cook() {
				System.out.println("집에서 만든 브로버거");
				System.out.println("재료 : 빵, 치킨패티, 양배추, 딸기잼, 치즈, 피클");
			}
		};
	}

	public static HomeMadeBurger getMomsTouch() {
		return  new HomeMadeBurger() {
			
			@Override
			public void cook() {
				System.out.println("집에서 만든 맘스버거");
				System.out.println("재료 : 빵, 소고기패티, 해쉬브라운, 양상추, 마요네즈, 피클");
			}
		};
	}
}


abstract class HomeMadeBurger {
	public abstract void cook();
}
