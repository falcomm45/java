package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
	public static void main(String[] args) {
		// ������
		
		// class Person : ���
		// class Student extends Person : �л� (�л��� ����̴�. Student is a Person)
		// class Teacher extends Person : ������ (�������� ����̴�. Teacher is a Person)
		
		Camera camera = new Camera();
		Camera factoryCam = new FactoryCam();
		Camera speedCam = new SpeedCam();
		
		camera.showMainFeature();
		factoryCam.showMainFeature();
		speedCam.showMainFeature();
		
		System.out.println("-----------------------");
		
		Camera[] cameras = new Camera[3];
		cameras[0] = new Camera();
		cameras[1] = new FactoryCam();
		cameras[2] = new SpeedCam();
		
		for (Camera cam : cameras) {
			cam.showMainFeature();
		}
		
		System.out.println("------------------------");
		
//		factoryCam.detectFire();
//		speedCam.checkSpeed();
//		speedCam.recognizeLicensePlate();
		
		
		if (camera instanceof Camera) {
			System.out.println("ī�޶� �Դϴ�.");
		}
		
		if (factoryCam instanceof FactoryCam) {
			((FactoryCam) factoryCam).detectFire();
			// factoryCam�� FactoryCam�� �ν��Ͻ� �ΰ�?
			// Camera ���� factoryCam �� FactoryCam ���� factoryCam ���� �� ��ȯ
			// �� .����ϰ����ϴ¸޼ҵ�� ȣ�Ⱑ��
		}
		
		if (speedCam instanceof SpeedCam) {
			((SpeedCam) speedCam).checkSpeed();
			((SpeedCam) speedCam).recognizeLicensePlate();
			// speedCam �� SpeedCam�� �ν��Ͻ� �ΰ�?
			// speedCam�� SpeedCam ������ �� ��ȯ ��
			// SpeedCam Ŭ������ ���� ����
		}
		
		Object[] objs = new Object[3];
		objs[0] = new Camera();
		objs[1] = new FactoryCam();
		objs[2] = new SpeedCam();
		// Object Ŭ������ �ڹ��� ��� Ŭ������ ����� �̹Ƿ�
		// extends ������� �ʾƵ� �迭�� ���� ���� ����
		
	}
}
