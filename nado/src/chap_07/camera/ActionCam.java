package chap_07.camera;

public final class ActionCam extends Camera{
	
	public final String lens; // = "���� ����";
	
	public ActionCam() {
		super("�׼� ī�޶�");
		lens = "��������";
	}
	
	public final void makeVideo() {
		System.out.println(this.name + " : " + this.lens + "�� �Կ��� ���� ������ �����մϴ�.");
	}
	
}
