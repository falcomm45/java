package chap_04;

public class _14_Example_03 {
    public static void main(String[] args) {

        // for문을 이용하여 1부터 100까지의 정수 중 3의 배수의 총합을 구하는 코드를 작성하시오

        int sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i%3 == 0) {
                sum += i;
            }
        }
        System.out.println("총 합은 " + sum + "입니다.");
        System.out.println("---------------------------");

        // while문과 math,random() 메소드를 이용하여 2개의 주사위를 던졌을때 나오는
        // 눈을 (눈1, 눈2) 형태로 출력하고 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의
        // 합이 5이면 실행을 멈추는 코드를 작성해보시오.

        while (true) {
            int num1 = (int) (Math.random()*6)+1;
            int num2 = (int) (Math.random()*6)+1;
            System.out.println("(" + num1 + ", " + num2 + ")");
            if (num1 + num2 == 5) {
                break;
            }
        }
        System.out.println("---------------------------");


        // 중첩 for문을 이용하여 방정식 4x+5y = 60 의 모든 해를 구해서 (x,y) 형태로 출력하세요
        // 단, x와 y는 10 이하의 자연수입니다.

        for (int x = 1; x < 11; x++) {
            for (int y = 1; y < 11; y++) {
                if ((4*x)+(5*y)==60) {
                    System.out.println("("+x+","+y+")");
                }
            }
        }
    }
}