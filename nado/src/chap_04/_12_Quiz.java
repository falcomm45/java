package chap_04;

public class _12_Quiz {
    public static void main(String[] args) {
        // ��������� �ð��� 4000�� (���� �ִ� ����� 30000��)
        // ���� �Ǵ� ����� ������ ���� ��ݿ��� 50% ����
        // ������
        // �Ϲ� ���� 5�ð� ���� ��  ���� ����� 20000�� �Դϴ�.
        // ���� 5�ð� ���� ��  ���� ����� 10000�� �Դϴ�.
        // ����� ���� 10�ð� ���� ��  ���� ����� 15000�� �Դϴ�.

        int hour = 5;
        boolean disabled = false;
        boolean lightCar = true;
        int fee = hour * 4000;

        if ((fee > 30000)&&((disabled = true) || (lightCar = true))) {
            fee = 15000;
            System.out.println("���� ����� " + fee + "�� �Դϴ�.");
        } else if ((fee > 30000)&&((disabled = false) && (lightCar = false))) {
            fee = 30000;
            System.out.println("���� ����� " + fee + "�� �Դϴ�.");
        } else if (fee < 30000) {
            System.out.println("���� ����� " + fee + "�� �Դϴ�.");
        }




    }
}

