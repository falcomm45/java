package chap_04;

public class _14_Example_03 {
    public static void main(String[] args) {

        // for���� �̿��Ͽ� 1���� 100������ ���� �� 3�� ����� ������ ���ϴ� �ڵ带 �ۼ��Ͻÿ�

        int sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i%3 == 0) {
                sum += i;
            }
        }
        System.out.println("�� ���� " + sum + "�Դϴ�.");
        System.out.println("---------------------------");

        // while���� math,random() �޼ҵ带 �̿��Ͽ� 2���� �ֻ����� �������� ������
        // ���� (��1, ��2) ���·� ����ϰ� ���� ���� 5�� �ƴϸ� ��� �ֻ����� ������, ����
        // ���� 5�̸� ������ ���ߴ� �ڵ带 �ۼ��غ��ÿ�.

        while (true) {
            int num1 = (int) (Math.random()*6)+1;
            int num2 = (int) (Math.random()*6)+1;
            System.out.println("(" + num1 + ", " + num2 + ")");
            if (num1 + num2 == 5) {
                break;
            }
        }
        System.out.println("---------------------------");


        // ��ø for���� �̿��Ͽ� ������ 4x+5y = 60 �� ��� �ظ� ���ؼ� (x,y) ���·� ����ϼ���
        // ��, x�� y�� 10 ������ �ڿ����Դϴ�.

        for (int x = 1; x < 11; x++) {
            for (int y = 1; y < 11; y++) {
                if ((4*x)+(5*y)==60) {
                    System.out.println("("+x+","+y+")");
                }
            }
        }
    }
}