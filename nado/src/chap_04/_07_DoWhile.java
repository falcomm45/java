package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // �ݺ��� DoWhile
        int distance = 25; // ��ü �Ÿ��� 25m
        int move = 0; // ���� �̵� �Ÿ� 0m
        int height = 2; // Ű 2m

        while (move + height < distance) {
            System.out.println("�����⸦ �մϴ�");
            System.out.println("���� �̵� �Ÿ��� " + move + "m �Դϴ�.");
            move += 3; // 3���� �̵�
        }
        System.out.println("�����߽��ϴ�.");

        System.out.println("----�ݺ��� #1----");
        // Ű�� ��û ū ���
        move = 0;
        height = 25; // Ű�� 25m
        while (move + height < distance) {
            System.out.println("�����⸦ �մϴ�");
            System.out.println("���� �̵� �Ÿ��� " + move + "m �Դϴ�.");
            move += 3; // 3���� �̵�
        }
        System.out.println("�����߽��ϴ�.");

        System.out.println("----�ݺ��� #2----");

        // Do While �ݺ���
        do{
            System.out.println("�����⸦ �մϴ�");
            System.out.println("���� �̵� �Ÿ��� " + move + "m �Դϴ�.");
            move += 3; // 3���� �̵�
        } while (move + height < distance);
        System.out.println("�����߽��ϴ�.");
    }
}
