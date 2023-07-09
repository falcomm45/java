package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and c.";

        // ���ڿ� ��ȯ
        System.out.println(s.replace(" and", ",")); // "and" �� "," �� ����
        System.out.println(s.substring(7)); // �ε��� ���� 7 ���� ���� (���� ������ ����)
        System.out.println(s.substring(s.indexOf("Java"))); // "Java" �� �����ϴ� ��ġ���� ����
        System.out.println(s.substring(s.indexOf("Java"), (s.indexOf(".")))); // ���� ��ġ ���� �� ��ġ "����"

        // ���� ����
        s = "      I love Java.      ";
        System.out.println(s);
        System.out.println(s.trim()); // �� �� ���� ��� ����

        // ���ڿ� ����
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2); // JavaPython
        System.out.println(s1 + ", " + s2); // Java, Python
        System.out.println(s1.concat(",").concat(s2)); // Java,Python
    }
}
