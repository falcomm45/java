package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
	public static void main(String[] args) {
		// 데이터 추상화 (Data Abstraction)
		// abstract
		// 추상 클래스 (아직 완성되지 않은 클래스)
		// 추상 메소드 (추상 클래스와 인터페이스 에서만 사용 가능한, 껍데기만 있는 메소드)
		// 추상 클래스는 추상 메소드를 가지지 않을 수도 있지만 가지지 않더라도 객체를 생성할 수 없다.
		
		// Camera camera = new Camera(); => 추상클래스이기 때문에 객체를 만들 수 없다.
		FactoryCam factoryCam = new FactoryCam();
		factoryCam.showMainFeature();
		
		SpeedCam speedCam = new SpeedCam();
		speedCam.showMainFeature();
		// 추상 클래스를 상속 받은 객체는 추상메소드가 있을 경우 메소드를 재정의 하고 객체를 생성할 수 있다.
		
		Camera facCamera = new FactoryCam();
		facCamera.showMainFeature();
		Camera speedCamera = new SpeedCam();
		speedCamera.showMainFeature();
		// 카메라 클래스를 상속한 자식 클래스 
		
	}
}
