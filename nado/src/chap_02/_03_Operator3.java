package chap_02;

public class _03_Operator3 {
    public static void main(String[] args) {
        // �� ������
        System.out.println(5 > 3); // 5 �� 3 ���� ũ�� (���̸� true, �����̸� false)
        System.out.println(5 >= 3); // 5 �� 3 ���� ũ�ų� ����. (true)
        System.out.println(5 >= 5); // 5 �� 5 ���� ũ�ų� ����. (true)
        System.out.println(5 >= 7); // 5 �� 7 ���� ũ�ų� ����. (false)

        System.out.println(5 < 3); // false
        System.out.println(5 <= 3); // false
        System.out.println(5 <= 7); // true

        System.out.println(5 == 5); // 5�� 5�� ����. true
        System.out.println(5 == 3); // 5�� 3�� ����. false
        System.out.println(5 != 5); // 5�� 5�� ���� �ʴ�. false
        System.out.println(5 != 3); // 5�� 3�� ���� �ʴ�. true
    }
}
