package _06_26;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {

		MemberServiceImplm service = new MemberServiceImplm();
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("--ȸ�� ���� ���α׷�--");
			System.out.println("1. ���  |  2. ��ȸ  |  3. ���  |  4. ����  |  5. ����  |  6. ����");
			System.out.println("----------------");
			System.out.print("�Է� : ");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				service.list();
				break;
			case 2:
				service.view();
				break;
			case 3:
				service.insert();
				break;
			case 4:
				service.edit();
				break;
			case 5:
				service.delete();
				break;
			case 6:
				service.exit();
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ� �ٽ� �Է��ϼ���.");
			}
		}
	}
}
