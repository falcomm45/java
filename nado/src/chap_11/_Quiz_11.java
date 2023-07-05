package chap_11;

// �߻� ���� ������ 2���� ���� : ��ǰ ���� �ð�, ��ǰ ����
// �� ������ ���� ����� ���� ���� Ŭ���� �ۼ�
// ���� �ڵ忡 ���� �ǵ��� ���� �߻� �� ���� ó��
// 0 �������� (��ǰ ���Ÿ� �Ϸ��Ͽ����ϴ�)		-
// 1 �Ǹ� �ð� �ƴ� ��ǰ ���� ���� �ð��� �ƴմϴ�.	��ǰ ���Ŵ� 20�ú��� �����մϴ�
// 2 ���� �ش� ��ǰ�� �����Ǿ����ϴ�.			���� ��ȸ�� �̿����ּ���
// 		��ä�����޼���					����ó���޼���
public class _Quiz_11 {

	public static void main(String[] args) {
		sale();
	}

	public static void sale() {
		int errorCode = 2;
		try {
			if (errorCode == 0) {
				System.out.println("��ǰ ���Ÿ� �Ϸ��Ͽ����ϴ�.");
			} else if(errorCode == 1) {
				throw new TimeYetException("��ǰ ���� ���� �ð��� �ƴմϴ�.");
			} else {
				throw new SoldOutException("�ش� ��ǰ�� �����Ǿ����ϴ�.");
			}
		} catch (TimeYetException e) {
			System.out.println(e.getMessage());
			System.out.println("��ǰ ���Ŵ� 20�ú��� �����մϴ�.");
		} catch (SoldOutException e) {
			System.out.println(e.getMessage());
			System.out.println("���� ��ȸ�� �̿����ּ���.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class TimeYetException extends Exception {
	public TimeYetException(String message) {
		super(message);
	}
}

class SoldOutException extends Exception {
	public SoldOutException(String message) {
		super(message);
	}
}
