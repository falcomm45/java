package chap_04;

public class _14_Example_02 {
    public static void main(String[] args) {

        // �ֻ��� ��ȣ �� �ϳ��� �������� �̾� �ش� ���ڰ� ������ ����
        while (true) {
            int num = (int) (Math.random() * 6) + 1;
            System.out.println(num);
            if (num == 6) {
                break;
            }
        }
        System.out.println("���α׷� ����");

        // �빮�� - �ҹ��� �ٱ��� �ݺ��� ����
        Outter: for(char upper = 'A'; upper <= 'Z'; upper++){
            for (char lower = 'a'; lower <= 'z' ; lower++) {
                System.out.println(upper +"-"+ lower);
                if (lower == 'g'){
                    break Outter;
                }
            }
        }
        System.out.println("���α׷� ����");

        // 1 ~ 10 �� ¦���� ���
        for (int i = 1; i < 11; i++) {
             if(i%2 != 0) {
                 continue;
             }
            System.out.println(i);
        }
    }
}

