package chap_07;

public class _01_Class {

	public static void main(String[] args) {
		// ��ü ���� ���α׷��� (OOP : Object-Oriented Programming)
		// �������� ����
		// ���� ���뼺
		
		String[] items = {"CPU", "RAM", "�ϵ��ũ"};
		
		// ������ ���ڽ�
		// �𵨸�, �ػ�, ����, ����

		// �츮�� ���� ù��° ��ǰ
		String modelName = "�����";
		String resolution = "FHD";
		int price = 200000;
		String color = "��";
		
		// ���ο� ��ǰ�� ����
		String modelName2 = "�Ͼ���";
		String resolution2 = "UHD";
		int price2 = 300000;
		String color2 = "ȭ��Ʈ";
		
		// �� �ٸ� ��ǰ�� ?
		BlackBox bbox = new BlackBox();
		// BlackBox Ŭ�����κ��� bbox ��� ��ü�� ����
		// bbox ��ü�� BlackBox Ŭ������ �ν��Ͻ�
		
		BlackBox bbox2 = new BlackBox();
	}

}
