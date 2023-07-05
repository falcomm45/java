package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
	public static void main(String[] args) {
		// 다형성
		
		// class Person : 사람
		// class Student extends Person : 학생 (학생은 사람이다. Student is a Person)
		// class Teacher extends Person : 선생님 (선생님은 사람이다. Teacher is a Person)
		
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
			System.out.println("카메라 입니다.");
		}
		
		if (factoryCam instanceof FactoryCam) {
			((FactoryCam) factoryCam).detectFire();
			// factoryCam이 FactoryCam의 인스턴스 인가?
			// Camera 형의 factoryCam 을 FactoryCam 형의 factoryCam 으로 형 변환
			// 후 .사용하고자하는메소드로 호출가능
		}
		
		if (speedCam instanceof SpeedCam) {
			((SpeedCam) speedCam).checkSpeed();
			((SpeedCam) speedCam).recognizeLicensePlate();
			// speedCam 이 SpeedCam의 인스턴스 인가?
			// speedCam을 SpeedCam 형으로 형 변환 후
			// SpeedCam 클래스로 접근 가능
		}
		
		Object[] objs = new Object[3];
		objs[0] = new Camera();
		objs[1] = new FactoryCam();
		objs[2] = new SpeedCam();
		// Object 클래스는 자바의 모든 클래스의 조상격 이므로
		// extends 사용하지 않아도 배열로 묶어 관리 가능
		
	}
}
