package chap_11;

public class _02_Catch {
	public static void main(String[] args) {
		try {
//			System.out.println(3 / 0);
			
//			int[] arr = new int[3];
//			arr[5] = 100;
		
//			Object obj = "test";
//			System.out.println((int)obj);
			
//			String s = null;
//			System.out.println(s.toLowerCase());
			
		} catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("�Ǽ�");
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("�Ǽ�");
		} catch(ClassCastException e) {
			System.out.println("�߸��� �� ��ȯ");
		} catch (Exception e) {
			System.out.println("�� ���� ��� ������ ���⼭ ó���˴ϴ�.");
			e.printStackTrace();
		}
		
		System.out.println("���α׷� ���� ����");
	}
}
