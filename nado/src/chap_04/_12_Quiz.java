package chap_04;

public class _12_Quiz {
    public static void main(String[] args) {
        // 주차요금은 시간당 4000원 (일일 최대 요금은 30000원)
        // 경차 또는 장애인 차량은 최종 요금에서 50% 할인
        // 실행결과
        // 일반 차량 5시간 주차 시  주차 요금은 20000원 입니다.
        // 경차 5시간 주차 시  주차 요금은 10000원 입니다.
        // 장애인 차량 10시간 주차 시  주차 요금은 15000원 입니다.

        int hour = 5;
        boolean disabled = false;
        boolean lightCar = true;
        int fee = hour * 4000;

        if ((fee > 30000)&&((disabled = true) || (lightCar = true))) {
            fee = 15000;
            System.out.println("주차 요금은 " + fee + "원 입니다.");
        } else if ((fee > 30000)&&((disabled = false) && (lightCar = false))) {
            fee = 30000;
            System.out.println("주차 요금은 " + fee + "원 입니다.");
        } else if (fee < 30000) {
            System.out.println("주차 요금은 " + fee + "원 입니다.");
        }




    }
}

