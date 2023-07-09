package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // 노쇼 손님 있다고 가능
        // For
        int max = 20; // 최대 판매 수량
        int sold = 0; // 현재 판매 수량
        int noShow = 17; // 대기번호 17번 노쇼 손님

        for (int i = 1; i < 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            // 손님이 없다면?
            if(i == noShow) {
                System.out.println(i + "번 손님, 안계시면 다음분 드릴께요.");
                continue;
            }

            sold++; // 판매 처리
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("--------------------------------");

        // While 문
        sold = 0;
        int index = 1; // 대기 번호
        while (index <= 50) {
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");

            // 손님이 없다면
            if (index == noShow) {
                System.out.println(index + "번 손님, 안계시면 다음분 드릴께요.");
                index++;
                continue;
            }

            sold++; // 판매 처리
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
            index++;
        }
        System.out.println("영업을 종료합니다.");
    }
}
