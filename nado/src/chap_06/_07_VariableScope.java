package chap_06;


public class _07_VariableScope {
	
	public static void methodA(int number) { // �Ű������� �����ϰ� �޼ҵ带 ȣ���Ҷ� �� ���� �����ϴ� ������� �������� ��밡��
		// System.out.println(number);
		// System.out.println(result);

	}
	
	public static void methodB() {
		int result = 1; // ���� ����
	}
	public static void main(String[] args) {
		int number = 3;
		//System.out.println(result); 
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			System.out.println(number);
		}
		
		// System.out.println(i);
		{
			int j = 0;
			System.out.println(j);
			System.out.println(number);
		}
		// System.out.println(j);
	}
	
	
}