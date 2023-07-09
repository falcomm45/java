package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean kimchi = false;
        boolean egg = true;
        boolean meet = false;

        System.out.println(kimchi || egg || meet); // 셋중 하나라도 true 라면 true (true)
        System.out.println(kimchi && egg && meet); // 모두 true 이면 true (false)

        // And 연산
        System.out.println((5 > 3) && (3 > 1)); // 5 는 3 보다 크고 3 은 1 보다 크다 (true)
        System.out.println((5>3) && (3 < 1)); // 5 는 3 보다 크고 3 은 1 보다 작다 (false)

        // Or 연산
        System.out.println((5 > 3) || (3 > 1)); // 5 는 3 보다 크거나 3 은 1 보다 크다 (true)
        System.out.println((5 > 3) || (3 < 1)); // 5 는 3 보다 크거나 3 은 1 보다 작다 (true)
        System.out.println((5 < 3) || (3 < 1)); // 5 는 3 보다 작거나 3 은 1 보다 작다 (false)

        // System.out.println(1 < 3 < 5); // 불가능한 코드
        System.out.println(1 < 3 && 3 < 5); // true

        //논리 부정 연산자
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5 == 5)); // false
        System.out.println(!(5 == 3)); // true
    }
}
