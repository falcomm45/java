package chap_04;

public class _13_QuizAnswer {
    public static void main(String[] args) {

        int hour = 4; // 주차 시간
        boolean disabled = false; // 장애 여부
        boolean lightCar = false; // 경차 여부

        int fee = 4000*hour; // 주차 정산 요금

        // 30000원 초과 시 일일 최대 요금으로 수정
        if (fee > 30000) {
            fee = 30000; // 일일 최대 요금 적용
        }

        // 경차 또는 장애인차량 50% 할인
        if (lightCar || disabled) {
            fee /= 2;
        }

        // 실행 결과 출력
        System.out.println("주차 요금은 " + fee + "원 입니다.");
    }
}