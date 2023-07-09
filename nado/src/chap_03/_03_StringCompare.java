package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // ���ڿ��� ��
         String s1 = "Java";
         String s2 = "Python";

        System.out.println(s1.equals(s2)); // ���ڿ� ������ ���ٸ� true, �ٸ��� false
        System.out.println(s1.equals("Java")); // true
        System.out.println(s2.equals("python")); // �� �ҹ��� �����ϹǷ� false

        // ��ҹ��� ���� ���� ���ڿ� ������ ������ ���� üũ
        System.out.println(s2.equalsIgnoreCase("python")); // true

        // ���ڿ� �� ��ȭ
        s1 = "1234"; // ���� ���� �޸����� ��й�ȣ ���� (����)
        s2 = "1234";
        System.out.println(s1.equals(s2)); // s1�� s2�� ������ ������ true (����)
        System.out.println(s1 == s2); // true (����)

        s1 = new String("1234"); // ������ ���� �ٸ� �޸����� ��й�ȣ�� ��� ���� ��
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false

    }
}
