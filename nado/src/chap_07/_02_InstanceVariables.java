package chap_07;

public class _02_InstanceVariables {
	public static void main(String[] args) {
		
		// ó�� ���� ���ڽ�
		BlackBox b1 = new BlackBox();
		b1.modelName = "�����";
		b1.resolution = "FHD";
		b1.price = 200000;
		b1.color = "��";
		
		System.out.println(b1.modelName);
		System.out.println(b1.resolution);
		System.out.println(b1.price);
		System.out.println(b1.color);
		
		System.out.println("------------------------");
		
		// ���ο� ���ڽ�
		BlackBox b2 = new BlackBox();
		b2.modelName = "�Ͼ���";
		b2.resolution = "UHD";
		b2.price = 300000;
		b2.color = "ȭ��Ʈ";
		
		System.out.println(b2.modelName);
		System.out.println(b2.resolution);
		System.out.println(b2.price);
		System.out.println(b2.color);
	}
}
