package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // ���ǹ� ElseIf

        // �Ѷ�� ���̵� ������ +1
        // �Ǵ� �����ֽ��� ������ +1
        // �Ǵ� ���̽� �Ƹ޸�ī�� +1

        boolean hallabongAde = true; // �Ѷ�����̵�
        boolean mangoJuice = true; // �����ֽ�

        if (hallabongAde){ // �Ѷ�����̵尡 �ִ���
            System.out.println("�Ѷ�� ���̵� +1");
        } else if (mangoJuice){ // �����ֽ��� �ִ���
            System.out.println("�����ֽ� +1");
        } else { // �Ƹ޸�ī��� ������ �����ϱ� else if �Ⱦ���
            System.out.println("���̽� �Ƹ޸�ī�� +1");
        }
        System.out.println("���� �ֹ� �Ϸ� #1");

        // else if �� ������ ��� ����
        hallabongAde = false;
        mangoJuice = false;
        boolean orangeJuice = true;

        if (hallabongAde){ // �Ѷ�����̵尡 �ִ���
            System.out.println("�Ѷ�� ���̵� +1");
        } else if (mangoJuice){ // �����ֽ��� �ִ���
            System.out.println("�����ֽ� +1");
        } else if (orangeJuice){ // �׷� �������ֽ��� ����?
            System.out.println("�������ֽ� +1");
        } else { // �Ƹ޸�ī��� ������ �����ϱ� else if �Ⱦ���
            System.out.println("���̽� �Ƹ޸�ī�� +1");
        }
        System.out.println("���� �ֹ� �Ϸ� #2");

        // else ��� ����
        hallabongAde = false;
        mangoJuice = false;
        orangeJuice = false;

        if (hallabongAde){ // �Ѷ�����̵尡 �ִ���
            System.out.println("�Ѷ�� ���̵� +1");
        } else if (mangoJuice){ // �����ֽ��� �ִ���
            System.out.println("�����ֽ� +1");
        } else if (orangeJuice){ // �׷� �������ֽ��� ����?
            System.out.println("�������ֽ� +1");
        }
        System.out.println("���� �ֹ� �Ϸ� #3");
    }
}
