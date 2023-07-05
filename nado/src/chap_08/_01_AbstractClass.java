package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
	public static void main(String[] args) {
		// ������ �߻�ȭ (Data Abstraction)
		// abstract
		// �߻� Ŭ���� (���� �ϼ����� ���� Ŭ����)
		// �߻� �޼ҵ� (�߻� Ŭ������ �������̽� ������ ��� ������, �����⸸ �ִ� �޼ҵ�)
		// �߻� Ŭ������ �߻� �޼ҵ带 ������ ���� ���� ������ ������ �ʴ��� ��ü�� ������ �� ����.
		
		// Camera camera = new Camera(); => �߻�Ŭ�����̱� ������ ��ü�� ���� �� ����.
		FactoryCam factoryCam = new FactoryCam();
		factoryCam.showMainFeature();
		
		SpeedCam speedCam = new SpeedCam();
		speedCam.showMainFeature();
		// �߻� Ŭ������ ��� ���� ��ü�� �߻�޼ҵ尡 ���� ��� �޼ҵ带 ������ �ϰ� ��ü�� ������ �� �ִ�.
		
		Camera facCamera = new FactoryCam();
		facCamera.showMainFeature();
		Camera speedCamera = new SpeedCam();
		speedCamera.showMainFeature();
		// ī�޶� Ŭ������ ����� �ڽ� Ŭ���� 
		
	}
}
