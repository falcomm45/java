package chap_07;

public class _09_GetterSetter {
	public static void main(String[] args) {
		BlackBox b1 = new BlackBox();
		b1.modelName = "�����";
		//b1.resolution = "FHD";
		b1.price = 200000;
		b1.color = "��";
		
		// ���� ���
		b1.price = -5000;
		System.out.println("���� : " + b1.price + "��");
		
		// �� ����
		System.out.println("�ػ� : " + b1.resolution);
		
		System.out.println("------------------------");
		
		BlackBox b2 = new BlackBox();
		b2.setModelName("�Ͼ���");
		b2.setPrice(-5000);
		b2.setColor("ȭ��Ʈ");
		
		System.out.println("���� : " + b2.getPrice() + "��");
		System.out.println("�ػ� : " + b2.getResolution());
		
	}
}
