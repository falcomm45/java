package chap_07;

public class BlackBoxRefurbish { // public Ŭ���� �� ��� Ŭ�������� �ڹ� ���ϸ�� ���ƾ� ��
   public String modelName; // �𵨸�
   
   String resolution; // �ػ�
   
   private int price; // ����
   
   protected String color; // ����

   public String getModelName() {
      return modelName;
   }

   public void setModelName(String modelName) {
      this.modelName = modelName;
   }

   public String getResolution() {
      if (resolution == null || resolution.isEmpty()) {
         return "�Ǹ��ڿ��� �����ϼ���.";
      }
      return resolution;
   }

   public void setResolution(String resolution) {
      this.resolution = resolution;
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      if (price < 100000) {
         this.price = 100000;
         } else {
            this.price = price;
         }
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }
   

}

class A {
	// default Ŭ����
}