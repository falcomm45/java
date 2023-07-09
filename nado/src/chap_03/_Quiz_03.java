package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String man = "901231-1234567";
        String woman = "030708-4567890";

        System.out.println(man.substring(man.indexOf("9"), man.lastIndexOf("2")));
        System.out.println(woman.substring(woman.indexOf("0"), woman.lastIndexOf("5")));

        // 0 과 5 를 숫자에서 문자로 String.valueOf 로 바꿔서 큰따옴표를 안씀
        System.out.println(woman.substring(woman.indexOf(String.valueOf(0)), woman.lastIndexOf(String.valueOf(5))));

        //풀이
        String id = "901231-1234567"; // 주민등록번호 13자리
        System.out.println(id.substring(0, 8)); // 0 위치부터 8 위치 직전까지
        id = "030708-4567890";
        System.out.println(id.substring(0, id.indexOf("-")+2)); // 0 위치부터 하이픈 위치 + 2 직전까지
    }
}
