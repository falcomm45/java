package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "����";
        int hour = 14;

        System.out.println( name + "��, ����� ���۵Ǿ����ϴ�. " + hour + "�� ��� �����Դϴ�.");
        System.out.println( name + "��, ����� �Ϸ� �Ǿ����ϴ�.");

        double score = 88.5;
        char grade = 'A';
        name = "������";
        System.out.println(name + "���� ������ " + score + "�� �Դϴ�.");
        System.out.println("������ " + grade + "�Դϴ�.");

        boolean pass = true;
        System.out.println("�̹� ���迡 �հ��������?" + pass);

        double d = 3.141592444444;
        float f = 3.1415924444444F;
        System.out.println(d);
        System.out.println(f);

        long i = 1000000000000L;
        i = 1_000_000_000_000L;
        System.out.println(i);

    }
}