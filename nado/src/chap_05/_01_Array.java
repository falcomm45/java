package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // �迭 : ���� �ڷ����� �� ���� ���� �����ϴ� ���ӵ� ����
        String coffeeRoss = "�Ƹ޸�ī��";
        String coffeeRachel = "ī���ī";
        String coffeeChandler = "��";
        String coffeeMonica = "īǪġ��";

        System.out.println(coffeeRoss+ " �ϳ�"); // �Ƹ޸�ī�� �ϳ�
        System.out.println(coffeeRachel+ " �ϳ�");
        System.out.println(coffeeChandler + " �ϳ�");
        System.out.println(coffeeMonica + " �ϳ�");
        System.out.println("�ּ���.");

        // �迭 ���� ù��° ���
        //String[] coffees = new String[4];

        // �迭 ���� �ι�° ���
        // String coffees[] = new String[4];

//        coffees[0] = "�Ƹ޸�ī��"; // 0���� ����
//        coffees[1] = "ī���ī";
//        coffees[2] = "ī���";
//        coffees[3] = "īǪġ��";

        // ����° ���
        //String[] coffees = new String[] {"�Ƹ޸�ī��", "ī���ī", "īǪġ��", "ī���"};

        // �׹�° ���
        String[] coffees = {"�Ƹ޸�ī��", "ī���ī", "īǪġ��", "ī���"};

        System.out.println("--------------------------------------");

        // Ŀ�� �ֹ�
        System.out.println(coffees[0] + " �ϳ�"); // �Ƹ޸�ī�� �ϳ�
        System.out.println(coffees[1] + " �ϳ�");
        coffees[2] = "����������";
        System.out.println(coffees[2] + " �ϳ�");
        System.out.println(coffees[3] + " �ϳ�");
        System.out.println("�ּ���.");

        // �ٸ� �ڷ���?
        int[] i = new int[4];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        i[3] = 4;
        double[] d = {0.1, 0.5, 0.9, 1.88, 1.99};
        System.out.println(d[4]);
        boolean[] b = {true, false, true};
    }
}