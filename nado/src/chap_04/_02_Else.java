package chap_04;

public class _02_Else {
    public static void main(String[] args) {
        // 조건문 If Else
        int hour = 10;
        if (14 > hour){ // 오후 2시 이전일 경우
            System.out.println("아이스 아메리카노 +1");
        }
        else { // 그 외의 경우이면
            System.out.println("디카페인 아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #1");

        // 오후 2시 이후이거나 모닝 커피를 마신 경우
        hour = 16;
        boolean morningCoffee = true;
        if (14 <= hour || morningCoffee == true) {
            System.out.println("디카페인 아이스 아메리카노 +1");
        }
        else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");
    }
}