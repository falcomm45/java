package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // Ư������, �̽������� ���� (Escape Sequence, Special Character)
        // \n \t \\ \" \'
        System.out.println("�ڹٰ�");
        System.out.println("�ʹ�");
        System.out.println("�������");

        // \n : �ٹٲ�
        System.out.println("�ڹٰ�\n�ʹ�\n�������");

        // \t : ��
        // �ع����� 9000��
        // ��ġ��   8000��
        // ������   8000��
        System.out.println("�ع�����\t9000��");
        System.out.println("��ġ��\t8000��");
        System.out.println("������\t8000��");

        // \\ : ��������
        System.out.println("C:\\program Files\\Java");

        // \" ū����ǥ
        // �ܺ� "�߿�" �̶�� �߾��.
        System.out.println("�ܺ� \"�߿�\" �̶�� �߾��.");

        // \' ��������ǥ
        // �ܺ� '�� ��?' ��� ǥ���� ������.
        System.out.println("�ܺ� \'�� ��?\' ��� ǥ���� ������.");
        System.out.println("�ܺ� '�� ��?' ��� ǥ���� ������.");

        char c = 'a';
        c = '\'';
        System.out.println(c);

    }
}