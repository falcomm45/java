package chap_11;

public class _01_TryCatch {
	public static void main(String[] args) {
		// ���� ó��
		// ���� : ������ ����, ��Ÿ�� ���� (���� error, ���� exception)
		// ���� (error) : �ڵ�� ó�� �� �� ��� �߻��ϱ� ���� �����ؾ���
		// ����(exception) : �ڵ�� ó���� �� ����
		
		// int i = "���ڿ�";  -> ������ ����
		
		// int[] arr = new int[3];
		// arr[5] = 100;	-> ��Ÿ�� ����
		
		// S s = new S();
		// S s = null;
		// s.methodA(); 
		
		try {
			// System.out.println(3 / 0);
			
			// int[] arr = new int[3];
			// arr[5] = 100;
			
			Object obj = "test";
			System.out.println((int)obj);
			
		} catch (Exception e) {
			System.out.println("���� �߻� ==>  " + e.getMessage());
			e.printStackTrace();
		}
		

		System.out.println("���α׷� ���� ����");
	}
}


//class S {
//	
//	public void methodA() {
//		this.methodA();
//	}
//}