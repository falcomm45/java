package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case

        // ������ ���� ���б� ����
        // 1�� : ���� ���б�
        // 2�� : �ݾ� ���б�
        // 3�� : �ݾ� ���б�
        // �� �� : ���б� ���� ��� �ƴ�

        // If Else ���� �̿��� ��� ( ���� ���� �Ǵ� ������ �ش��ϴ� ������ ���)
        int ranking = 1; // ���
        if (ranking == 1){
            System.out.println("���� ���б�");
        } else if (ranking == 2){
            System.out.println("�ݾ� ���б�");
        } else if (ranking == 3){
            System.out.println("�ݾ� ���б�");
            // else if (ranking == 2 || ranking == 3){
            // System.out.println("�ݾ� ���б�");}        2��� 3���� ��� ���� �����Ƿ� Or ���� || �� �ѹ��� ����
        } else {
            System.out.println("���б� ���� ��� �ƴ�");
        }
        System.out.println("��ȸ �Ϸ� #1");

        // Switch Case ���� �̿� (��Ȯ�� ���̽��� �ִ� ���)
        /*switch ( expression ) {
            case A : ... ������ ��� ...
                break;
            case B : ... ������ ��� ...
                break;
            case C : ... ������ ��� ...
                break;
                ...
            default: ... ������ ��� ...
        }*/

        ranking = 2;
        switch (ranking) {
            case 1 :
                System.out.println("���� ���б�");
                break;
            case 2 :
                System.out.println("�ݾ� ���б�");
                break;
            case 3 :
                System.out.println("�ݾ� ���б�");
                break;
            default :
                System.out.println("���б� ���� ��� �ƴ�");
        }
        System.out.println("��ȸ �Ϸ� #2");

        // case 2 �� 3 �� ����
        ranking = 2;
        switch (ranking) {
            case 1 :
                System.out.println("���� ���б�");
                break;
            case 2 :
            case 3 :
                System.out.println("�ݾ� ���б�");
                break;
            default :
                System.out.println("���б� ���� ��� �ƴ�");
        }
        System.out.println("��ȸ �Ϸ� #3");

        // �߰��ǰ�� ��޿� ���� ������ å�� (1�� : �ֻ�, 4�� : ����)
        int grade = 1; // ���
        int price = 7000; // �⺻����
        switch (grade) {
            case 1 :
                price += 1000; // price = price + 1000;
            case 2 :
                price += 1000; // break; ��� ����
            case 3 :
                price += 1000;
                break;
        }
        System.out.println(grade + "��� ��ǰ�� ������ " + price + "�� �Դϴ�.");
        // ��� ������ ��Ÿ�� ��� if, else if (��������)
        // ��Ȯ�� ������ ��Ÿ�� ��� switchCase
    }
}