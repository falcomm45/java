package chap_07;

public class _04_Method {
	public static void main(String[] args) {
		BlackBox b1 = new BlackBox();
		b1.modelName = "�����";
		
		b1.autoReport(); // ���� �Ұ�
		BlackBox.canAutoReport = true;
		b1.autoReport(); // ������
		
		b1.insertMemoryCard(256);
		
		// �Ϲ� ���� : 1 (type)
		// �̺�Ʈ ���� (�浹 ����) : 2
		int fileCount = b1.getVideoFileCount(1); // �Ϲݿ���
		System.out.println("�Ϲ� ���� ���� �� : " + fileCount + "��");
		
		fileCount = b1.getVideoFileCount(2);
		System.out.println("�̺�Ʈ ���� ���� �� : " + fileCount + "��");
	}
}
