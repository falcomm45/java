package chap_06;

public class _02_Parameter {
	public static void power(int num) { // Parameter, �Ű�����, ���ް�
		int result = num * num;
		System.out.println(num + "�� 2 ���� " + result);
	}
	
	public static void powerByExp(int num, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= num;	
		}
		System.out.println(num + "�� "+ exponent+" ���� " + result);
	}
	
	
	
	public static void main(String[] args) {
		// ���ް�, Parameter
		
		
		// Argument, �μ�
		power(4); // 4 * 4 = 16
		powerByExp(3, 4); // 3 * 3 * 3 * 3 = 81
	}
}
