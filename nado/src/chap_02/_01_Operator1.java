package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // ��� ������

        // �Ϲ� ����
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(5 / 2); // 2.5 XX 2 (������ ����)
        System.out.println(2 / 4); // 0.5 XX 0 (������ ����)
        System.out.println(4 % 2); // 0 �������� ������
        System.out.println(5 % 2); // 1
        System.out.println(8 % 3); // 2

        //�켱 ���� ����
        System.out.println( 2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8

        //������ �̿��� ����
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c); // 30

        c = a - b;
        System.out.println(c); // 10

        c = a * b;
        System.out.println(c); // 200

        c = a / b;
        System.out.println(c); // 2

        c = a % b;
        System.out.println(c); // 0

        // ���� ����  ++, --
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10  ���� ���� sout ���� �� ���� �� +1
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9
        System.out.println(val); // 9

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // 10
        System.out.println(val); // 9

        // ���� ����ȣ ǥ
        int waiting = 0;
        System.out.println("��� �ο� : " + waiting++); // ��� �ο� : 0
        System.out.println("��� �ο� : " + waiting++); // ��� �ο� : 1
        System.out.println("��� �ο� : " + waiting++); // ��� �ο� : 2
        System.out.println("�� ��� �ο� : " + waiting); // �� ��� �ο� : 3

    }
}
