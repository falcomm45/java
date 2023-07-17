package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        // 가나 매장
        System.out.println("어서오세요. 가나입니다.");
        // 또 다른 손님이 들어오면?
        System.out.println("어서오세요. 가나입니다.");
        System.out.println("어서오세요. 가나입니다.");
        System.out.println("어서오세요. 가나입니다.");
        System.out.println("어서오세요. 가나입니다.");
        System.out.println("어서오세요. 가나입니다.");
        System.out.println("어서오세요. 가나입니다.");
        // 만약 인사법이 바뀌면?
        System.out.println("환영합니다. 가나입니다.");
        System.out.println("환영합니다. 가나입니다.");
        System.out.println("환영합니다. 가나입니다.");
        // 매장 이름이 바뀌면?
        // 가나 -> 나가
        System.out.println("환용합니다. 나가입니다.");
        System.out.println("-----반복문 사용------");

        // 반복문 For
       /* for ( 선언 ; 조건 ; 증감 ){

        }*/

        for (int i = 0; i < 10; i++){
            //System.out.println("어서오세요. 가나입니다." + i);
            //System.out.println("환영합니다. 가나입니다." + i);
            System.out.println("환영합니다. 나가입니다." + i);
        }

        // 짝수만 출력 (fori 만 적고 enter)
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }
        System.out.println(); // 빈공간

        //홀수만 출력
        // 1 3 5 7 9
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i);
        }
        System.out.println();

        // 거꾸로 숫자
        // 5 4 3 2 1
        for (int i = 5; i >= 1; i-- ){
            System.out.print(i);
        }
        System.out.println();

        // 1부터 10 까지의 합 = 55
        int sum = 0;
        for (int i = 1; i < 11; i++){
            sum += i;
            System.out.println("현재까지의 총합은 " + sum + "입니다.");
        }
        System.out.println("1부터 10까지의 모든 정수의 총합은 " + sum + "입니다.");

		for (int i = 0; i < 5; i++) {
			if (true) {
				for (int j = 0; j < 5; j++) {
					System.out.println(i + "   " + j);
					if (i == j) {
						System.out.println("zz");
						break;
					}
				}

			}
		}
	}
}
