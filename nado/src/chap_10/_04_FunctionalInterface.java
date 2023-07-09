package chap_10;

import chap_10.converter.Convertible;
import chap_10.converter.ConvertibleWithNoParams;
import chap_10.converter.ConvertibleWithReturn;
import chap_10.converter.ConvertibleWithTwoParams;
import chap_10.converter.KRWConverter;

public class _04_FunctionalInterface {
	public static void main(String[] args) {
		KRWConverter converter = new KRWConverter();
		// converter.convert(2);
		
		// convertUSD((USD) -> System.out.println(USD + "달러 = " + (USD * 1400) + "원"), 12);
		
		// 함수형 인터페이스
		Convertible convertible = (USD) -> System.out.println(USD + "달러 = " + (USD * 1400) + "원");
		convertUSD(convertible, 16);
		convertible.convert(12);
		// 인터페이스에는 단 하나의 추상메소드가 존재해야만 함수형 인터페이스를 구현할 수 있다.
		
		// 클래스 내에서 기능을 정의하는 것 메소드
		// 클래스 밖에서 기능을 정의하는 것 함수
		
		// 전달값이 하나도 없다면?
		ConvertibleWithNoParams c1 = () -> System.out.println("1달러 : 1400원");
		c1.converter();
		
		// 두 줄 이상의 코드가 있다면?
		c1 = () -> {
			int USD = 5;
			int KRW = 1400;
			System.out.println(USD + "달러 : " + (USD * KRW) + "원");
		};
		c1.converter();
		
		// 전달값이 2개인 경우?
		ConvertibleWithTwoParams c2 = (d, w) -> System.out.println(d + "달러 : " + (d * w) + "원");
		c2.convert(57, 1400);
		
		// 반환값이 있는 경우?
		ConvertibleWithReturn c3 = (d, w) -> d*w;
		int result = c3.convert(27, 1400);
		System.out.println("20달러 : " + result + "원");
		
	}
	
	public static void convertUSD(Convertible converter, int USD) {
		converter.convert(USD);
	}
}
