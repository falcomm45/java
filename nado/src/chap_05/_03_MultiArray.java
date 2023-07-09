package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        // ������ �迭 (2���� �迭)

        // �ұԸ� ��ȭ�� �¼�
        // A1 - A5
        // B1 - B5
        // C1 - C5

        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        // 3X5 ũ���� 2���� �迭
        String[][] seats = new String [][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // B2�� �����Ϸ���?
        System.out.println(seats[1][1]);
        // C5�� ����
        System.out.println(seats[2][4]);

        // ù �ٿ��� 3ĭ, ��° �ٿ��� 4ĭ, ��° �ٿ��� 5ĭ
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // A3�� �����Ϸ���
        System.out.println(seats2[0][2]);

        // A5�� �����Ϸ���
        // System.out.println(seats2[0][4]);
        // �ڷᰡ �����Ƿ� ����

        // 3���� �迭 ����� (���� X ���� X ����)
        String [][][] marray = new String[][][] {
                { { }, { }, { } },
                { { }, { }, { } },
                { { }, { }, { } }
        };
        System.out.println(marray[1][0][2]);
    }
}