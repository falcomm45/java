package chap_07;

public class _03_ClassVariables {
	public static void main(String[] args) {
		BlackBox b1 = new BlackBox();
		b1.modelName = "�����";
		System.out.println(b1.modelName);
		
		BlackBox b2 = new BlackBox();
		b2.modelName = "�Ͼ���";
		System.out.println(b2.modelName);
		
		// Ư�� ������ �ʰ��ϴ� �浹 ���� �� �ڵ� �Ű� ��� ���� ����
		System.out.println(" - ���� �� -");
		System.out.println(b1.modelName + " �ڵ� �Ű� ��� : " + b1.canAutoReport);
		System.out.println(b2.modelName + " �ڵ� �Ű� ��� : " + b2.canAutoReport);
		System.out.println("��� ���ڽ� ��ǰ�� �ڵ� �Ű� ��� : " + BlackBox.canAutoReport);
		// Ŭ���������� �� ��ü�� �̸����� Ŭ�����̸�.�޼ҵ� �� ǥ���� ������
		
		// ��� ����
		BlackBox.canAutoReport = true;
		System.out.println(" - ���� �� -");
		System.out.println(b1.modelName + " �ڵ� �Ű� ��� : " + b1.canAutoReport);
		System.out.println(b2.modelName + " �ڵ� �Ű� ��� : " + b2.canAutoReport);
		System.out.println("��� ���ڽ� ��ǰ�� �ڵ� �Ű� ��� : " + BlackBox.canAutoReport);
	}

}
