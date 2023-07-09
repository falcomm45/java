package chap_04;

public class _09_MultipleTable {
    public static void main(String[] args) {
        // ±¸±¸´Ü

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(String.valueOf(i) + "X" + String.valueOf(j) + " = " + i*j);
            }
            System.out.println();
        }


        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }
            System.out.println();
        }
    }
}
