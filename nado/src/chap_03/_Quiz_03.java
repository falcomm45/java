package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String man = "901231-1234567";
        String woman = "030708-4567890";

        System.out.println(man.substring(man.indexOf("9"), man.lastIndexOf("2")));
        System.out.println(woman.substring(woman.indexOf("0"), woman.lastIndexOf("5")));

        // 0 �� 5 �� ���ڿ��� ���ڷ� String.valueOf �� �ٲ㼭 ū����ǥ�� �Ⱦ�
        System.out.println(woman.substring(woman.indexOf(String.valueOf(0)), woman.lastIndexOf(String.valueOf(5))));

        //Ǯ��
        String id = "901231-1234567"; // �ֹε�Ϲ�ȣ 13�ڸ�
        System.out.println(id.substring(0, 8)); // 0 ��ġ���� 8 ��ġ ��������
        id = "030708-4567890";
        System.out.println(id.substring(0, id.indexOf("-")+2)); // 0 ��ġ���� ������ ��ġ + 2 ��������
    }
}
