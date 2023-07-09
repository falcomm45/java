package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf

        // 한라봉 에이도 있으면 +1
        // 또는 망고주스가 있으면 +1
        // 또는 아이스 아메리카노 +1

        boolean hallabongAde = true; // 한라봉에이드
        boolean mangoJuice = true; // 망고주스

        if (hallabongAde){ // 한라봉에이드가 있느냐
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice){ // 망고주스가 있느냐
            System.out.println("망고주스 +1");
        } else { // 아메리카노는 무조건 있으니까 else if 안쓴다
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("음료 주문 완료 #1");

        // else if 는 여러번 사용 가능
        hallabongAde = false;
        mangoJuice = false;
        boolean orangeJuice = true;

        if (hallabongAde){ // 한라봉에이드가 있느냐
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice){ // 망고주스가 있느냐
            System.out.println("망고주스 +1");
        } else if (orangeJuice){ // 그럼 오렌지주스는 있음?
            System.out.println("오렌지주스 +1");
        } else { // 아메리카노는 무조건 있으니까 else if 안쓴다
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("음료 주문 완료 #2");

        // else 없어도 가능
        hallabongAde = false;
        mangoJuice = false;
        orangeJuice = false;

        if (hallabongAde){ // 한라봉에이드가 있느냐
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice){ // 망고주스가 있느냐
            System.out.println("망고주스 +1");
        } else if (orangeJuice){ // 그럼 오렌지주스는 있음?
            System.out.println("오렌지주스 +1");
        }
        System.out.println("음료 주문 완료 #3");
    }
}
