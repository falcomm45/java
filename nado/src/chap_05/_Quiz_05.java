package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        // �迭�� Ȱ���Ͽ� ���θ����� ���� ������ �Ź� ������ �ɼ��� ����ϴ� ���α׷�
        // �Ź� ������� 250���� 295���� 5������ ����
        // �Ź� ������ ���� �� 10����

        String[] size = {
                "������ 250 (�������)", "������ 255 (�������)","������ 260 (�������)","������ 265 (�������)", "������ 270 (�������)",
                "������ 275 (�������)", "������ 280 (�������)","������ 285 (�������)","������ 290 (�������)","������ 295 (�������)"
        };

        for (int i = 0; i < size.length; i++) {
            System.out.println(size[i]);
        }
        System.out.println("-------------------------------------------------");

        int sizeArray[] = {
          250, 255, 260, 265, 270, 275, 280, 285, 290, 295
        };
        for (int i = 0; i < sizeArray.length; i++) {
            System.out.println("������ " + sizeArray[i] + " (�������)");
        }
        System.out.println("-------------------------------------------------");

        int sizeArray1[] = new int[10];
        for (int i = 0; i < sizeArray1.length; i++) {
            sizeArray1[i] = 250 + (5 * i);
        }

        for (int i = 0; i < sizeArray1.length; i++) {
            System.out.println("������ " + sizeArray1[i] + " (�������)");
        }
        System.out.println("-------------------------------------------------");
        for (int size1 : sizeArray1) {
            System.out.println("������ " + size1 + " �������");
        }
    }
}
