package chap_06;

public class _08_MainMethod {
	public static void main(String[] args) {
		for (String s : args) {
			System.out.println(s);

		}

		// 1. 도서 조회
		// 2. 도서 대출
		// 3. 도서 반납
		if (args.length == 1) {
			switch (args[0]) {
			case "1":
				System.out.println("도서조회");
				break;
			case "2":
				System.out.println("도서 대출");
				break;
			case "3":
				System.out.println("도서 반납");
				break;
			default:
				System.out.println("잘못된 입력입니다");
			}
		} else {
			System.out.println("1~3 중 하나를 입력하세요");
		}
	}
}
