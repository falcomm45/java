package chap_07;

import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _15_Super {
	public static void main(String[] args) {
		// Super
		// super.[] => 부모 클래스의 메소드나 변수로 접근
		// super() => 부모 클래스의 생성자에 접근
		
		FactoryCam factoryCam = new FactoryCam();
		SpeedCam speedCam = new SpeedCam();
		
		factoryCam.recordVideo();
		System.out.println("-------------------");
		speedCam.takePicture();
		
		
	}
}
