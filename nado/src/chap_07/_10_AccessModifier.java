package chap_07;

public class _10_AccessModifier {
   public static void main(String[] args) {
	   
	  // ĸ��ȭ (Encapsulation)
	  // �������� (Information hiding)
	   
      // ���� ������
      // private : �ش� Ŭ���� �������� ���� ����
      // public : ��� Ŭ�������� ���� ����
      // default : (�ƹ��͵� ���� �ʾ�����) ���� ��Ű�� �������� ���� ����
      // protected : ���� ��Ű�� ������, �ٸ� ��Ű���� ��� �ڽ� Ŭ�������� ���� ����
      
      BlackBoxRefurbish b1 = new BlackBoxRefurbish();
      b1.modelName = "�����";
      //b1.resolution = "FHD";
      b1.setPrice(200000);
      b1.color = "��";
      
      // ���� ���
      b1.setPrice(-5000);
      System.out.println("���� : " + b1.getPrice() + "��");
      
      // �� ����
      System.out.println("�ػ� : " + b1.resolution);
      
      System.out.println("------------------------");
      
      BlackBoxRefurbish b2 = new BlackBoxRefurbish();
      b2.setModelName("�Ͼ���");
      b2.setPrice(-5000);
      b2.setColor("ȭ��Ʈ");
      
      System.out.println("���� : " + b2.getPrice() + "��");
      System.out.println("�ػ� : " + b2.getResolution());
      
   }

}