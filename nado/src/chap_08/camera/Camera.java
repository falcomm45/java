package chap_08.camera;

public abstract class Camera {
	// �ش� Ŭ������ ��ü�� ������ ���ϰ� �ϱ� ���ؼ� abstract Ű���带 �̿��� �� �� �ִ�.
	
	
	public void takePicture() {
		System.out.println("������ �Կ��մϴ�.");
	}
	
	public void recordVideo() {
		System.out.println("�������� ��ȭ�մϴ�.");
	}
	
	public abstract void showMainFeature(); // �޼ҵ带 ���� �ϰ� ����
											// �ڽ� Ŭ�������� �����ؾ� �ϴ� �޼ҵ�
}
