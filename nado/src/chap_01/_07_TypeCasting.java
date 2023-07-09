package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // �� ��ȯ TypeCasting
        // ���������� �Ǽ�������
        // �Ǽ������� ����������

        // int to float, double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); // 93.0
        System.out.println((double) score); // 93.0

        // float, double  to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int) score_f); // 93
        System.out.println((int) score_d); // 98

        // ���� +  �Ǽ� ����
        score = 93 + (int) 98.8; // 93 + 98
        System.out.println(score); // 191

        score_d = (double) 93+98.8; // 93+98.8
        System.out.println(score_d); // 191.8

        // ������ ����ȯ�� ������ ����ֱ�
        double convertedScoreDouble = score; // 191 -> 191.0
        System.out.println(convertedScoreDouble); // 191.0
        // int -> long -> float -> double (�ڵ� ����ȯ)

        int convertedScoreInt = (int) score_d; // 191.8 -> 191
        // double -> float -> long -> int (���� ����ȯ)

        // ���ڸ� ���ڿ���  ��Ʈ������������
        String s1 = String.valueOf(93); // ��Ʈ���� ������� Ȥ��
        s1 = Integer.toString(93);      //��Ƽ���� ����Ʈ��
        System.out.println(s1); // 93

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2); // 98.8

        // ���ڿ��� ���ڷ�  ���ڿ��� �Ľ��Ѵ�
        int i = Integer.parseInt("93");
        System.out.println(i); // 93
        double d = Double.parseDouble("98.8");
        System.out.println(d); // 98.8

        int error = Integer.parseInt("�ڹ�");
    }
}
