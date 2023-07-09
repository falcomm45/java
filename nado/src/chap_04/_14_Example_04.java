package chap_04;

public class _14_Example_04 {
    public static void main(String[] args) {

        // 삼각형

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if (i>=j) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("------------------");
        // 역삼각형

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if (i<=4-j) {
                    System.out.print(" ");
                } else System.out.print("*");
            }
            System.out.println();
        }

        System.out.printf("이름: %1$s\n나이: %2$d","감자바" ,25);
    }
}