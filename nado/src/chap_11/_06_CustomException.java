package chap_11;

public class _06_CustomException {
	public static void main(String[] args) {
		// ����� ���� ����
		int age = 17;
		try {
			if (age<19) {
				// System.out.println("�� 19�� �̸����Դ� �Ǹ����� �ʽ��ϴ�.");
				throw new AgeLessThan19Exception("�� 19�� �̸����Դ� �Ǹ����� �ʽ��ϴ�.");
			} else {
				System.out.println("�ֹ��Ͻ� ��ǰ�Դϴ�.");
			}
		} catch(AgeLessThan19Exception e) {
			System.out.println("�������� �ߴ۰� ���̳� �ڼ���");
		} catch(Exception e) {
			System.out.println("��� ���ܸ� ó���մϴ�.");
		}
	}
}


class AgeLessThan19Exception extends Exception {
	
	public AgeLessThan19Exception(String message) {
		super(message);
		}
}
