package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // �迭�� ��ȸ

        String[] coffees = {"�Ƹ޸�ī��", "ī���ī", "īǪġ��", "ī���"};
        // System.out.println(coffees[0] + " �ϳ�");
        // System.out.println(coffees[1] + " �ϳ�");
        // �迭�� ���� �ǹ̰� ����

        // for �ݺ��� ��ȸ
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " �ϳ�");
        }
        System.out.println("�ּ���.");

        System.out.println("---------------------------------");

        // �迭�� ���̸� �̿��� ��ȸ
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " �ϳ�");
        }
        System.out.println("�ּ���.");
        System.out.println("---------------------------------");

        // enhanced for (for-each) �ݺ���
        for (String coffee : coffees) {
            System.out.println(coffee + " �ϳ�");
        }
        System.out.println("�ּ���.");
        System.out.println("---------------------------------");

        for (String coffee :
                coffees) {
            System.out.println(coffee + " �ϳ�");
        }
        System.out.println("�ּ���.");
    }
}