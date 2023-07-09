package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        // 배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램
        // 신발 사이즈는 250부터 295까지 5단위로 증가
        // 신발 사이즈 수는 총 10가지

        String[] size = {
                "사이즈 250 (재고있음)", "사이즈 255 (재고있음)","사이즈 260 (재고있음)","사이즈 265 (재고있음)", "사이즈 270 (재고있음)",
                "사이즈 275 (재고있음)", "사이즈 280 (재고있음)","사이즈 285 (재고있음)","사이즈 290 (재고있음)","사이즈 295 (재고있음)"
        };

        for (int i = 0; i < size.length; i++) {
            System.out.println(size[i]);
        }
        System.out.println("-------------------------------------------------");

        int sizeArray[] = {
          250, 255, 260, 265, 270, 275, 280, 285, 290, 295
        };
        for (int i = 0; i < sizeArray.length; i++) {
            System.out.println("사이즈 " + sizeArray[i] + " (재고있음)");
        }
        System.out.println("-------------------------------------------------");

        int sizeArray1[] = new int[10];
        for (int i = 0; i < sizeArray1.length; i++) {
            sizeArray1[i] = 250 + (5 * i);
        }

        for (int i = 0; i < sizeArray1.length; i++) {
            System.out.println("사이즈 " + sizeArray1[i] + " (재고있음)");
        }
        System.out.println("-------------------------------------------------");
        for (int size1 : sizeArray1) {
            System.out.println("사이즈 " + size1 + " 재고있음");
        }
    }
}
