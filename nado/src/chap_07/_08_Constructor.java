package chap_07;

public class _08_Constructor {
	public static void main(String[] args) {
		
		BlackBox b1 = new BlackBox();
		b1.modelName = "�����";
		b1.resolution = "FHD";
		b1.price = 200000;
		b1.color = "��";
		System.out.println(b1.modelName);
		System.out.println(b1.serialNumber);
		
		BlackBox b2 = new BlackBox("�Ͼ���", "UHD", 300000, "ȭ��Ʈ"); 
//		System.out.println(b2.modelName);
//		System.out.println(b2.resolution);
//		System.out.println(b2.price);
//		System.out.println(b2.color);
		System.out.println(b2.modelName);
		System.out.println(b2.serialNumber);
		
		
	}
}
