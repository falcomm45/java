package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _13_MethodOverriding {
	public static void main(String[] args) {
		
		// �޼ҵ� �������̵� : �ڽ� Ŭ�������� �θ� Ŭ������ �޼ҵ带 �����(������)
		Camera camera = new Camera();
		FactoryCam factoryCam = new FactoryCam();
		SpeedCam speedCam = new SpeedCam();
		
		camera.showMainFeature();
		factoryCam.showMainFeature();
		speedCam.showMainFeature();
	}
}
