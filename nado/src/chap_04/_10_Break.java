package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        // Break
        // ġŲ ������ ���� 20������ �Ǹ� (1�δ� 1������ ���� ����)
        // �մ� 50��

        // For ��
        int max = 20; // �ִ� 20����
        for (int i = 1; i <= 50 ; i++) {
            System.out.println(i + "�� �մ�, �ֹ��Ͻ� ġŲ ���Խ��ϴ�.");
            if (i == max) {
                System.out.println("���� ��ᰡ ��� �����Ǿ����ϴ�.");
                break; // �ݺ����� Ż��
            }
        }
        System.out.println("������ �����մϴ�.");

        System.out.println("-------------------------");

        // While ��
        int index = 1; // �մ� ��� ��ȣ
        while (index <= 50) {
            System.out.println(index + "�� �մ� �ֹ��Ͻ� ġŲ ���Խ��ϴ�.");
            if (index == max) {
                System.out.println("���� ��ᰡ ��� �����Ǿ����ϴ�.");
                break;
            }
            index++;
        }
    }
}
