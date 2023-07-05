package _06_26;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {

		MemberServiceImplm service = new MemberServiceImplm();
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("--회원 관리 프로그램--");
			System.out.println("1. 목록  |  2. 조회  |  3. 등록  |  4. 수정  |  5. 삭제  |  6. 종료");
			System.out.println("----------------");
			System.out.print("입력 : ");
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
				System.out.println("잘못 입력하셨습니다 다시 입력하세요.");
			}
		}
	}
}
