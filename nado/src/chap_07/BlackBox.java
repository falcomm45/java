package chap_07;

public class BlackBox {
   
   String modelName; // �𵨸�
   
   String resolution; // �ػ�
   
   int price; // ����
   
   String color; // ����
   
   int serialNumber; // �ø����ȣ
   
   static int counter = 0; // �ø����ȣ ���� ++ 
   
   static boolean canAutoReport = false; // �ڵ� �Ű� ���, static ���̸� Ŭ��������
                                // Ŭ�����κ��� ��������� ��� ��ü�� �Ȱ��� �����
   
    BlackBox() {
      System.out.println("�⺻ ������ ȣ��");
      this.serialNumber = ++counter;
      System.out.println("���ο� �ø��� �ѹ��� �߱� �޾ҽ��ϴ�." + this.serialNumber);
   }
   
   BlackBox(String modelName, String resolution, int price, String color) {
      this(); // �⺻�����ڸ� �����Ͽ� ������ ����(ȣ��)
      
      System.out.println("����� ���� ������ ȣ��");
      this.modelName = modelName;
      this.resolution = resolution;
      this.price = price;
      this.color = color;
   } // ������ �����ε�
   
   // ��ȯ�� ���ް� ���� �޼ҵ�
   void autoReport() {
      if (canAutoReport) {
         System.out.println("�浹�� �����Ǿ� �ڵ����� �Ű��մϴ�.");
      } else {
         System.out.println("�ڵ� �Ű� ����� �������� �ʽ��ϴ�.");
      }
   }
   
   // ���ް��� �ִ� �޼ҵ�
   void insertMemoryCard(int capacity) {
      System.out.println("�޸� ī�尡 ���ԵǾ����ϴ�.");
      System.out.println("�뷮�� " + capacity + "GB �Դϴ�.");
   }
   
   // ��ȯ���� ���ް��� �ִ� �޼ҵ�
   int getVideoFileCount (int type) {
      if (type == 1) { // �Ϲ� ����
         return 9;
      } else if (type == 2) {
         return 1;
      }
      return 10;
   }
   
   // showDataType : ��¥���� ǥ�ÿ���
   // showSpeed : �ӵ����� ǥ�ÿ���
   // min : ���� ��� ����(��)
   void record (boolean showDataType, boolean showSpeed, int min) {
      System.out.println("��ȭ�� �����մϴ�.");
      if (showDataType) {
         System.out.println("���� ��¥������ ǥ�õ˴ϴ�.");
      }
      if (showSpeed) {
         System.out.println("���� �ӵ������� ǥ�õ˴ϴ�.");
      }
      System.out.println("������ " + min + "�� ������ ��ϵ˴ϴ�.");
   }
   
   void record () {
      
//      System.out.println("��ȭ�� �����մϴ�.");
//      System.out.println("���� ��¥������ ǥ�õ˴ϴ�.");
//      System.out.println("���� �ӵ������� ǥ�õ˴ϴ�.");
//      System.out.println("������ 5�� ������ ��ϵ˴ϴ�.");
      
//       �� ó�� �ۼ��� ��� ������ ���ټ��� ������
      record(true, true, 5);
//      ������ �ۼ��ߴ� �޼ҵ带 ��Ȱ���ؼ� ������ ������
   }
   
   static void callServiceCenter() {
      System.out.println("���� ����(1588-0000) �� �����մϴ�.");
      // modelName = "test";
      canAutoReport = false;
      // static ���� ������ Ŭ���������� static �޼ҵ忡�� �ٷ� ����� �� �ִ�.
      // ��ü�� ��������� ��������� instance ���� modelName �� ����� �� ����.
      // Ŭ���� �޼ҵ带 ����Ҷ��� �޼ҵ� ������ instance ������ ����� �ʿ���� ��쿡 ����Ѵ�.
   }

   void appendModelName(String modelName) {
      this.modelName += modelName;
      // �ν��Ͻ� ������ �Ķ���� ������ ���� ��� this�� �ٿ� �ν��Ͻ� �������� ��Ÿ����
   }
   
   // Getter & Setter
   // ���� ������ ���� �޼ҵ� & ���� �����ϴ� �޼ҵ�
   String getModelName() {
      return modelName;
   }
   
   void setModelName(String modelName) {
      this.modelName = modelName;
   }
   
   String getResolution() {
      if (resolution == null || resolution.isEmpty()) {
         return "�Ǹ��ڿ��� �����ϼ���.";
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
