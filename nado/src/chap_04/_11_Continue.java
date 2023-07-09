package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // ��� �մ� �ִٰ� ����
        // For
        int max = 20; // �ִ� �Ǹ� ����
        int sold = 0; // ���� �Ǹ� ����
        int noShow = 17; // ����ȣ 17�� ��� �մ�

        for (int i = 1; i < 50; i++) {
            System.out.println(i + "�� �մ�, �ֹ��Ͻ� ġŲ ���Խ��ϴ�.");

            // �մ��� ���ٸ�?
            if(i == noShow) {
                System.out.println(i + "�� �մ�, �Ȱ�ø� ������ �帱����.");
                continue;
            }

            sold++; // �Ǹ� ó��
            if (sold == max) {
                System.out.println("���� ��ᰡ ��� �����Ǿ����ϴ�.");
                break;
            }
        }
        System.out.println("������ �����մϴ�.");

        System.out.println("--------------------------------");

        // While ��
        sold = 0;
        int index = 1; // ��� ��ȣ
        while (index <= 50) {
            System.out.println(index + "�� �մ�, �ֹ��Ͻ� ġŲ ���Խ��ϴ�.");

            // �մ��� ���ٸ�
            if (index == noShow) {
                System.out.println(index + "�� �մ�, �Ȱ�ø� ������ �帱����.");
                index++;
                continue;
            }

            sold++; // �Ǹ� ó��
            if (sold == max) {
                System.out.println("���� ��ᰡ ��� �����Ǿ����ϴ�.");
                break;
            }
            index++;
        }
        System.out.println("������ �����մϴ�.");
    }
}
