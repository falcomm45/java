package chap_04;

public class _14_Example_01 {
    public static void main(String[] args) {
        // 1 부터 10 까지 출력
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // 1부터 100 까지의 합
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum+= i;
            System.out.println(sum);
        }
        System.out.println("1~100 합 : " + sum);

        // 구구단 만들기
        for (int i = 2; i <= 9; i++) {
            System.out.println("*** " + i + "단 ***");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i +"X"+ j +" = "+ (i*j));
            }
        }

        // While 문 1부터 10까지 출력
        int c = 1;
        while (c <= 10) {
            System.out.println(c);
            c++;
        }

        // While 문 1부터 100까지의 합
        int i = 1;
        sum = 0;

        while (i<=100) {
            sum += i;
            i++;
        }
        System.out.println("1부터 "+(i-1)+"까지의 합은 "+sum+"입니다.");
    }
}
