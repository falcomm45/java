package chap_04;

public class _14_Example_04 {
    public static void main(String[] args) {

        // �ﰢ��

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if (i>=j) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("------------------");
        // ���ﰢ��

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if (i<=4-j) {
                    System.out.print(" ");
                } else System.out.print("*");
            }
            System.out.println();
        }

        System.out.printf("�̸�: %1$s\n����: %2$d","���ڹ�" ,25);
    }
}