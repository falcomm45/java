package chap_04;

public class _02_Else {
    public static void main(String[] args) {
        // ���ǹ� If Else
        int hour = 10;
        if (14 > hour){ // ���� 2�� ������ ���
            System.out.println("���̽� �Ƹ޸�ī�� +1");
        }
        else { // �� ���� ����̸�
            System.out.println("��ī���� ���̽� �Ƹ޸�ī�� +1");
        }
        System.out.println("Ŀ�� �ֹ� �Ϸ� #1");

        // ���� 2�� �����̰ų� ��� Ŀ�Ǹ� ���� ���
        hour = 16;
        boolean morningCoffee = true;
        if (14 <= hour || morningCoffee == true) {
            System.out.println("��ī���� ���̽� �Ƹ޸�ī�� +1");
        }
        else {
            System.out.println("���̽� �Ƹ޸�ī�� +1");
        }
        System.out.println("Ŀ�� �ֹ� �Ϸ� #2");
    }
}