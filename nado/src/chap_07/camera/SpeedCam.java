package chap_07.camera;

// SpeedCam is a Camera. (IS-A)
public class SpeedCam extends Camera { // �ڽ� Ŭ����
//	public String name;
	
	public SpeedCam(){
		// this.name = "���Ӵܼ� ī�޶�";
		super("���Ӵܼ� ī�޶�");
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
	public void takePicture() {
		super.takePicture();
		checkSpeed();
		recognizeLicensePlate();
	}
	
	public void checkSpeed() {
		// �ӵ� üũ
		System.out.println("�ӵ��� �����մϴ�.");
	}
	
	public void recognizeLicensePlate() {
		// ��ȣ �ν�
		System.out.println("���� ��ȣ�� �ν��մϴ�.");
	}
	
	@Override // annotation
	public void showMainFeature() {
		System.out.println(this.name + "�� �ֿ� ��� : �ӵ� ����, ���� ��ȣ �ν�");
	}
}
