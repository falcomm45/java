package chap_11;

public class _04_Finally {
	public static void main(String[] args) {
		try {
			System.out.println("�ý��� ���� ����.");
			throw new Exception("�޹� �ý�");
//			System.out.println("�ýÿ� ž���Ѵ�.");
		} catch(Exception e) {
			System.out.println("!! ���� �߻� !!" + e.getMessage());
		} finally {
			System.out.println("�ý��� ���� �ݴ´�.");
		}
		
		// try + catch(s)
		
		// try + catch(s) + finally
		
		// try + finally
		
		System.out.println("----------------------");
		
		try {
			System.out.println(3/0);
		} finally {
			System.out.println("���α׷� ����");
		}
	}
}
