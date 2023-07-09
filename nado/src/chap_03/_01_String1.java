package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and c.";
        System.out.println(s);

        // ���ڿ��� ����
        System.out.println(s.length()); // 29

        // ��ҹ��� ��ȯ
        System.out.println(s.toUpperCase()); // �빮�ڷ�
        System.out.println(s.toLowerCase()); // �ҹ��ڷ�

        // ���� ����
        System.out.println(s.contains("Java")); // ���Եȴٸ� true
        System.out.println(s.contains("C#")); // ���Ե��� �ʴ´ٸ� false
        System.out.println(s.indexOf("Java")); // ��ġ ���� 7
        System.out.println(s.indexOf("C#")); // ���Ե��� �ʴ´ٸ� -1
        System.out.println(s.indexOf("and")); // ó�� ��ġ�ϴ� ��ġ ���� 12
        System.out.println(s.lastIndexOf("and")); // ������ ��ġ�ϴ� ��ġ ���� 23
        System.out.println(s.startsWith("I like")); // �� ���ڿ��� �����ϸ� true (�ƴϸ� false)
        System.out.println(s.endsWith(".")); // �� ���ڿ��� ������ true (�ƴϸ� false)
    }
}
