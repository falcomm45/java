package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        // 키가 120cm 이상인 경우 탑승 가능
        // 삼항 연산자 이용
        // 실행결과
        // 키가 115cm 이므로 탑승 불가능합니다.
        // 키가 121cm 이므로 탑승 가능합니다.

        int a = 115;
        int b = 121;

        String c = ((a>120) ? "가능합니다." : "불가능합니다.");
        System.out.println("키가 " + a +"cm 이므로 탑승 " + c);
        String d = ((b<120) ? "불가능합니다." : "가능합니다.");
        System.out.println("키가 " + b + "cm 이므로 탑승 " + d);

        // 풀이
        int height = 115;
        String result = ((height >= 120) ? "탑승 가능합니다." : "탑승 불가능합니다.");
        System.out.println("키가 " + height + "cm 이므로 " + result);
    }
}
