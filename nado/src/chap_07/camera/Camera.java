package chap_07.camera;

public class Camera { // �θ� Ŭ����
	public String name;

	public Camera() {
		this("ī�޶�");
	} 
	
	protected Camera(String name) {
		this.name = name;
	}
	
	public void takePicture() {
		// ���� �Կ�
		System.out.println(this.name + " : ������ �Կ��մϴ�.");
	}
	
	public void recordVideo() {
		// ������ ��ȭ
		System.out.println(this.name + " : ������ ��ȭ�� �����մϴ�.");
	}
	
	public void showMainFeature() {
		System.out.println(this.name + "�� �ֿ� ��� : ���� �Կ�, ������ ��ȭ");
	}
	
}
