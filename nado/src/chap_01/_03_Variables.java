package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "꽃형";
        int hour = 14;

        System.out.println( name + "님, 배송이 시작되었습니다. " + hour + "시 배송 예정입니다.");
        System.out.println( name + "님, 배송이 완료 되었습니다.");

        double score = 88.5;
        char grade = 'A';
        name = "임형택";
        System.out.println(name + "님의 성적은 " + score + "점 입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요?" + pass);

        double d = 3.141592444444;
        float f = 3.1415924444444F;
        System.out.println(d);
        System.out.println(f);

        long i = 1000000000000L;
        i = 1_000_000_000_000L;
        System.out.println(i);

    }
}