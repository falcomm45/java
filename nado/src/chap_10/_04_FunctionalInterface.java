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
		
		// convertUSD((USD) -> System.out.println(USD + "�޷� = " + (USD * 1400) + "��"), 12);
		
		// �Լ��� �������̽�
		Convertible convertible = (USD) -> System.out.println(USD + "�޷� = " + (USD * 1400) + "��");
		convertUSD(convertible, 16);
		convertible.convert(12);
		// �������̽����� �� �ϳ��� �߻�޼ҵ尡 �����ؾ߸� �Լ��� �������̽��� ������ �� �ִ�.
		
		// Ŭ���� ������ ����� �����ϴ� �� �޼ҵ�
		// Ŭ���� �ۿ��� ����� �����ϴ� �� �Լ�
		
		// ���ް��� �ϳ��� ���ٸ�?
		ConvertibleWithNoParams c1 = () -> System.out.println("1�޷� : 1400��");
		c1.converter();
		
		// �� �� �̻��� �ڵ尡 �ִٸ�?
		c1 = () -> {
			int USD = 5;
			int KRW = 1400;
			System.out.println(USD + "�޷� : " + (USD * KRW) + "��");
		};
		c1.converter();
		
		// ���ް��� 2���� ���?
		ConvertibleWithTwoParams c2 = (d, w) -> System.out.println(d + "�޷� : " + (d * w) + "��");
		c2.convert(57, 1400);
		
		// ��ȯ���� �ִ� ���?
		ConvertibleWithReturn c3 = (d, w) -> d*w;
		int result = c3.convert(27, 1400);
		System.out.println("20�޷� : " + result + "��");
		
	}
	
	public static void convertUSD(Convertible converter, int USD) {
		converter.convert(USD);
	}
}
