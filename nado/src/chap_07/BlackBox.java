package chap_07;

public class BlackBox {
   
   String modelName; // 모델명
   
   String resolution; // 해상도
   
   int price; // 가격
   
   String color; // 색상
   
   int serialNumber; // 시리얼번호
   
   static int counter = 0; // 시리얼번호 생성 ++ 
   
   static boolean canAutoReport = false; // 자동 신고 기능, static 붙이면 클래스변수
                                // 클래스로부터 만들어지는 모든 객체에 똑같이 적용됨
   
    BlackBox() {
      System.out.println("기본 생성자 호출");
      this.serialNumber = ++counter;
      System.out.println("새로운 시리얼 넘버를 발급 받았습니다." + this.serialNumber);
   }
   
   BlackBox(String modelName, String resolution, int price, String color) {
      this(); // 기본생성자를 접근하여 동작을 수행(호출)
      
      System.out.println("사용자 정의 생성자 호출");
      this.modelName = modelName;
      this.resolution = resolution;
      this.price = price;
      this.color = color;
   } // 생성자 오버로딩
   
   // 반환값 전달값 없는 메소드
   void autoReport() {
      if (canAutoReport) {
         System.out.println("충돌이 감지되어 자동으로 신고합니다.");
      } else {
         System.out.println("자동 신고 기능이 지원되지 않습니다.");
      }
   }
   
   // 전달값이 있는 메소드
   void insertMemoryCard(int capacity) {
      System.out.println("메모리 카드가 삽입되었습니다.");
      System.out.println("용량은 " + capacity + "GB 입니다.");
   }
   
   // 반환값과 전달값이 있는 메소드
   int getVideoFileCount (int type) {
      if (type == 1) { // 일반 영상
         return 9;
      } else if (type == 2) {
         return 1;
      }
      return 10;
   }
   
   // showDataType : 날짜정보 표시여부
   // showSpeed : 속도정보 표시여부
   // min : 영상 기록 단위(분)
   void record (boolean showDataType, boolean showSpeed, int min) {
      System.out.println("녹화를 시작합니다.");
      if (showDataType) {
         System.out.println("영상에 날짜정보가 표시됩니다.");
      }
      if (showSpeed) {
         System.out.println("영상에 속도정보가 표시됩니다.");
      }
      System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
   }
   
   void record () {
      
//      System.out.println("녹화를 시작합니다.");
//      System.out.println("영상에 날짜정보가 표시됩니다.");
//      System.out.println("영상에 속도정보가 표시됩니다.");
//      System.out.println("영상은 5분 단위로 기록됩니다.");
      
//       위 처럼 작성할 경우 수정의 접근성이 떨어짐
      record(true, true, 5);
//      위에서 작성했던 메소드를 재활용해서 수정에 용이함
   }
   
   static void callServiceCenter() {
      System.out.println("서비스 센터(1588-0000) 로 연결합니다.");
      // modelName = "test";
      canAutoReport = false;
      // static 으로 선언한 클래스변수는 static 메소드에서 바로 사용할 수 있다.
      // 객체가 만들어져야 만들어지는 instance 변수 modelName 은 사용할 수 없다.
      // 클래스 메소드를 사용할때는 메소드 내에서 instance 변수의 사용이 필요없는 경우에 사용한다.
   }

   void appendModelName(String modelName) {
      this.modelName += modelName;
      // 인스턴스 변수와 파라미터 변수가 같은 경우 this를 붙여 인스턴스 변수임을 나타낸다
   }
   
   // Getter & Setter
   // 값을 가지고 오는 메소드 & 값을 설정하는 메소드
   String getModelName() {
      return modelName;
   }
   
   void setModelName(String modelName) {
      this.modelName = modelName;
   }
   
   String getResolution() {
      if (resolution == null || resolution.isEmpty()) {
         return "판매자에게 문의하세요.";
      }
      return resolution;
   }
   
   void setResolution(String resolution) {
      this.resolution = resolution;
   }
   
   int getPrice () {
      return price;
   }
   
   void setPrice (int price) {
      if (price < 100000) {
      this.price = 100000;
      } else {
         this.price = price;
      }
   }
   
   String getColor() {
      return color;
   }
   
   void setColor(String color) {
      this.color = color;
   }
}
