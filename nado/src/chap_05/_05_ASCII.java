package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // �ƽ�Ű �ڵ� : �̱� ǥ�� �ڵ�
        // ���ĺ� �빮��(A)�� 65���� ����, �ҹ���(a)�� 97���� ����, ����(0)�� 48���� ����.

        char c = 'A';
        System.out.println(c);
        System.out.println((int)c);

        c = 'B';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);

        // ����ũ�� 10 ����ũ�� 15�� �ش��ϴ� ��ȭ�� �¼�
        String [][] seats3 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3 [i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }
        // ��ȭ�� �¼� ��ȣ Ȯ��
        for (int i = 0; i < seats3.length; i++) { // ����
            for (int j = 0; j < seats3[i].length; j++) { // ����
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }
    }
}