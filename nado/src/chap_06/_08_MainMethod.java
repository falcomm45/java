package chap_06;

public class _08_MainMethod {
	public static void main(String[] args) {
		for (String s : args) {
			System.out.println(s);

		}

		// 1. ���� ��ȸ
		// 2. ���� ����
		// 3. ���� �ݳ�
		if (args.length == 1) {
			switch (args[0]) {
			case "1":
				System.out.println("������ȸ");
				break;
			case "2":
				System.out.println("���� ����");
				break;
			case "3":
				System.out.println("���� �ݳ�");
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�");
			}
		} else {
			System.out.println("1~3 �� �ϳ��� �Է��ϼ���");
		}
	}
}
