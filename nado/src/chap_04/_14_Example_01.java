package chap_04;

public class _14_Example_01 {
    public static void main(String[] args) {
        // 1 ���� 10 ���� ���
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // 1���� 100 ������ ��
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum+= i;
            System.out.println(sum);
        }
        System.out.println("1~100 �� : " + sum);

        // ������ �����
        for (int i = 2; i <= 9; i++) {
            System.out.println("*** " + i + "�� ***");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i +"X"+ j +" = "+ (i*j));
            }
        }

        // While �� 1���� 10���� ���
        int c = 1;
        while (c <= 10) {
            System.out.println(c);
            c++;
        }

        // While �� 1���� 100������ ��
        int i = 1;
        sum = 0;

        while (i<=100) {
            sum += i;
            i++;
        }
        System.out.println("1���� "+(i-1)+"������ ���� "+sum+"�Դϴ�.");
    }
}
