package chap_04;

public class _06_While {
    public static void main(String[] args) {
        // �ݺ��� While
        int distance = 25; // ��ü �Ÿ��� 25m
        int move = 0; // ���� �̵� �Ÿ� 0m

        while (move <= distance) { // ���� �̵��Ÿ��� ��ü�Ÿ����� �۴ٴ� ������ ���� ���� �ݺ� ����
            System.out.println("�����⸦ ��� �մϴ�.");
            System.out.println("���� �̵� �Ÿ� : " + move);
            move += 3; // 3m �̵�
        }
        System.out.println("�����Ͽ����ϴ�.");

        // ���� ����
        while (move <= distance) { // ���� �̵��Ÿ��� ��ü�Ÿ����� �۴ٴ� ������ ���� ���� �ݺ� ����
            System.out.println("�����⸦ ��� �մϴ�.");
            System.out.println("���� �̵� �Ÿ� : " + move);
        }
        System.out.println("�����Ͽ����ϴ�.");
    }
}