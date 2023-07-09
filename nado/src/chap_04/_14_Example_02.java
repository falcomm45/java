package chap_04;

public class _14_Example_02 {
    public static void main(String[] args) {

        // 주사위 번호 중 하나를 무작위로 뽑아 해당 숫자가 나오면 종료
        while (true) {
            int num = (int) (Math.random() * 6) + 1;
            System.out.println(num);
            if (num == 6) {
                break;
            }
        }
        System.out.println("프로그램 종료");

        // 대문자 - 소문자 바깥쪽 반복문 종료
        Outter: for(char upper = 'A'; upper <= 'Z'; upper++){
            for (char lower = 'a'; lower <= 'z' ; lower++) {
                System.out.println(upper +"-"+ lower);
                if (lower == 'g'){
                    break Outter;
                }
            }
        }
        System.out.println("프로그램 종료");

        // 1 ~ 10 중 짝수만 출력
        for (int i = 1; i < 11; i++) {
             if(i%2 != 0) {
                 continue;
             }
            System.out.println(i);
        }
    }
}

