package chap_11;

public class _03_Throw {
	public static void main(String[] args) {
		int age = 17; // �� 17��
		
		try {
			if (age<19) {
				// System.out.println("�� 19�� �̸����Դ� �Ǹ����� �ʽ��ϴ�.");
				throw new Exception("�� 19�� �̸����Դ� �Ǹ����� �ʽ��ϴ�.");
			} else {
				System.out.println("�ֹ��Ͻ� ��ǰ�Դϴ�.");
			}
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
