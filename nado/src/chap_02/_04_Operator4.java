package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // �� ������
        boolean kimchi = false;
        boolean egg = true;
        boolean meet = false;

        System.out.println(kimchi || egg || meet); // ���� �ϳ��� true ��� true (true)
        System.out.println(kimchi && egg && meet); // ��� true �̸� true (false)

        // And ����
        System.out.println((5 > 3) && (3 > 1)); // 5 �� 3 ���� ũ�� 3 �� 1 ���� ũ�� (true)
        System.out.println((5>3) && (3 < 1)); // 5 �� 3 ���� ũ�� 3 �� 1 ���� �۴� (false)

        // Or ����
        System.out.println((5 > 3) || (3 > 1)); // 5 �� 3 ���� ũ�ų� 3 �� 1 ���� ũ�� (true)
        System.out.println((5 > 3) || (3 < 1)); // 5 �� 3 ���� ũ�ų� 3 �� 1 ���� �۴� (true)
        System.out.println((5 < 3) || (3 < 1)); // 5 �� 3 ���� �۰ų� 3 �� 1 ���� �۴� (false)

        // System.out.println(1 < 3 < 5); // �Ұ����� �ڵ�
        System.out.println(1 < 3 && 3 < 5); // true

        //�� ���� ������
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5 == 5)); // false
        System.out.println(!(5 == 3)); // true
    }
}
