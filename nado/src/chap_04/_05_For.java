package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // �ݺ��� For
        // ���� ����
        System.out.println("�������. �����Դϴ�.");
        // �� �ٸ� �մ��� ������?
        System.out.println("�������. �����Դϴ�.");
        System.out.println("�������. �����Դϴ�.");
        System.out.println("�������. �����Դϴ�.");
        System.out.println("�������. �����Դϴ�.");
        System.out.println("�������. �����Դϴ�.");
        System.out.println("�������. �����Դϴ�.");
        // ���� �λ���� �ٲ��?
        System.out.println("ȯ���մϴ�. �����Դϴ�.");
        System.out.println("ȯ���մϴ�. �����Դϴ�.");
        System.out.println("ȯ���մϴ�. �����Դϴ�.");
        // ���� �̸��� �ٲ��?
        // ���� -> ����
        System.out.println("ȯ���մϴ�. �����Դϴ�.");
        System.out.println("-----�ݺ��� ���------");

        // �ݺ��� For
       /* for ( ���� ; ���� ; ���� ){

        }*/

        for (int i = 0; i < 10; i++){
            //System.out.println("�������. �����Դϴ�." + i);
            //System.out.println("ȯ���մϴ�. �����Դϴ�." + i);
            System.out.println("ȯ���մϴ�. �����Դϴ�." + i);
        }

        // ¦���� ��� (fori �� ���� enter)
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }
        System.out.println(); // �����

        //Ȧ���� ���
        // 1 3 5 7 9
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i);
        }
        System.out.println();

        // �Ųٷ� ����
        // 5 4 3 2 1
        for (int i = 5; i >= 1; i-- ){
            System.out.print(i);
        }
        System.out.println();

        // 1���� 10 ������ �� = 55
        int sum = 0;
        for (int i = 1; i < 11; i++){
            sum += i;
            System.out.println("��������� ������ " + sum + "�Դϴ�.");
        }
        System.out.println("1���� 10������ ��� ������ ������ " + sum + "�Դϴ�.");

		for (int i = 0; i < 5; i++) {
			if (true) {
				for (int j = 0; j < 5; j++) {
					System.out.println(i + "   " + j);
					if (i == j) {
						System.out.println("zz");
						break;
					}
				}

			}
		}
	}
}
