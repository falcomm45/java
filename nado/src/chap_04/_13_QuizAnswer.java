package chap_04;

public class _13_QuizAnswer {
    public static void main(String[] args) {

        int hour = 4; // ���� �ð�
        boolean disabled = false; // ��� ����
        boolean lightCar = false; // ���� ����

        int fee = 4000*hour; // ���� ���� ���

        // 30000�� �ʰ� �� ���� �ִ� ������� ����
        if (fee > 30000) {
            fee = 30000; // ���� �ִ� ��� ����
        }

        // ���� �Ǵ� ��������� 50% ����
        if (lightCar || disabled) {
            fee /= 2;
        }

        // ���� ��� ���
        System.out.println("���� ����� " + fee + "�� �Դϴ�.");
    }
}