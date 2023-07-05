package chap_06;

public class _02_Parameter {
	public static void power(int num) { // Parameter, 매개변수, 전달값
		int result = num * num;
		System.out.println(num + "의 2 승은 " + result);
	}
	
	public static void powerByExp(int num, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= num;	
		}
		System.out.println(num + "의 "+ exponent+" 승은 " + result);
	}
	
	
	
	public static void main(String[] args) {
		// 전달값, Parameter
		
		
		// Argument, 인수
		power(4); // 4 * 4 = 16
		powerByExp(3, 4); // 3 * 3 * 3 * 3 = 81
	}
}
