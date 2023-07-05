package chap_06;

public class _05_Overloading {
	
	public static int getPower(int num) {
		int result = num*num;
		return result;
		// return num*num;
	}
	
	public static int getPower(String strNumber) {
		int number = Integer.parseInt(strNumber);
		return number * number;
	}
	

	public static int getPower (int number, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= number;	
		}
		return result;
	}
	public static void main(String[] args) {
		// �޼ҵ� �����ε�
		// ���� �̸��� �޼ҵ带 ������ ����
		// 1. ���ް��� Ÿ���� �ٸ��ų�
		// 2. ���ް��� ������ �ٸ��ų�
		System.out.println(getPower(3)); // int��
		System.out.println(getPower("3")); // ������
		System.out.println(getPower(3, 3));
		System.out.println(getPower(5, 4));
	}
}
