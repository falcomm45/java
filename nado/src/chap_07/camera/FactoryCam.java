package chap_07.camera;

// FactoryCam is a Camera. (IS-A)
public class FactoryCam extends Camera { // �ڽ� Ŭ����
//	public String name;
	
	public FactoryCam() {
		// this.name = "���� ī�޶�";
		super("���� ī�޶�");
	}
	
//	public void takePicture() {
//		// ���� �Կ�
//		System.out.println("������ �Կ��մϴ�.");
//	}
//	
//	public void recordVideo() {
//		// ������ ��ȭ
//		System.out.println("������ ��ȭ�� �����մϴ�.");
//	}
//	
	public void recordVideo() {
		super.recordVideo();
		detectFire();
	}
	
	public void detectFire() {
		// ȭ�� ����
		System.out.println("ȭ�縦 �����մϴ�.");
	}
	
	public void showMainFeature() {
		System.out.println(this.name + "�� �ֿ� ��� : ȭ�� ����");
	}
}
