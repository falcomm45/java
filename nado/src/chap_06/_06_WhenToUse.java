package chap_06;

public class _06_WhenToUse {
	
	public static int getPower(int num) {
		return getPower(num, 2);
	}
	
	public static int getPower(int num, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= num;	
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		// 메소드가 필요한 이유
		
		// 2의 2승 구하기
//		int result = 1;
//		for (int i = 0; i < 2; i++) {
//			result *= 2;	
//		}
//		System.out.println(result);
		System.out.println(getPower(2, 2));
		
		// 3의 3승 구하기
//		result = 1;
//		for (int i = 0; i < 3; i++) {
//			result *= 3;	
//		}
//		System.out.println(result);
		System.out.println(getPower(3, 3));
		
		// 4의 2승 구하기
//		result = 1;
//		for (int i = 0; i < 2; i++) {
//			result *= 4;	
//		}
//		System.out.println(result);
		
		System.out.println(getPower(4, 2));
	}
}
