package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        // Ű�� 120cm �̻��� ��� ž�� ����
        // ���� ������ �̿�
        // ������
        // Ű�� 115cm �̹Ƿ� ž�� �Ұ����մϴ�.
        // Ű�� 121cm �̹Ƿ� ž�� �����մϴ�.

        int a = 115;
        int b = 121;

        String c = ((a>120) ? "�����մϴ�." : "�Ұ����մϴ�.");
        System.out.println("Ű�� " + a +"cm �̹Ƿ� ž�� " + c);
        String d = ((b<120) ? "�Ұ����մϴ�." : "�����մϴ�.");
        System.out.println("Ű�� " + b + "cm �̹Ƿ� ž�� " + d);

        // Ǯ��
        int height = 115;
        String result = ((height >= 120) ? "ž�� �����մϴ�." : "ž�� �Ұ����մϴ�.");
        System.out.println("Ű�� " + height + "cm �̹Ƿ� " + result);
    }
}
