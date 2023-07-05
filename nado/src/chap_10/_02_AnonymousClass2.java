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
				System.out.println("������ ���� ��ι���");
				System.out.println("��� : ��, ġŲ��Ƽ, �����, ������, ġ��, ��Ŭ");
			}
		};
	}

	public static HomeMadeBurger getMomsTouch() {
		return  new HomeMadeBurger() {
			
			@Override
			public void cook() {
				System.out.println("������ ���� ��������");
				System.out.println("��� : ��, �Ұ����Ƽ, �ؽ�����, �����, �������, ��Ŭ");
			}
		};
	}
}


abstract class HomeMadeBurger {
	public abstract void cook();
}
