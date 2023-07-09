package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;
import chap_08.detector.*;
import chap_08.reporter.*;

public class _02_Interface {
	public static void main(String[] args) {
		
		// 인터페이스
		
		NomalReporter nomalReporter = new NomalReporter();
		nomalReporter.report();
		
		VideoReporter videoReporter = new VideoReporter();
		videoReporter.report();
		
		Reportable nomalReporter2 = new NomalReporter();
		Reportable videoReporter2 = new VideoReporter();
		
		// 인터페이스를 생성함으로써 인터페이스를 구현하는 모든 클래스들은 인터페이스 자체를 통해서 참조할 수 있다.
		// Reportable 인터페이스를 구현하기 위해서는 추상메소드 report 를 무조건 오버라이드 해야하므로
		// Reportable 인터페이스를 구현한 모든 클래스들은 재정의한 report 메소드를 무조건 가지고있다.
		System.out.println("-------------------------------------");
		
		Detectable fireDetector = new FireDetector();
		fireDetector.detect();
		
		Detectable advancedFireDetector = new AdvancedFireDetector();
		advancedFireDetector.detect();
		
		System.out.println("-------------------------------------");
		
		FactoryCam factoryCam = new FactoryCam();
		factoryCam.setDetector(fireDetector);
		factoryCam.setReporter(nomalReporter);
		
		factoryCam.detect();
		factoryCam.report();
		
		System.out.println("-------------------------------------");
		
		SpeedCam speedCam = new SpeedCam();
		AccidentDetector accident = new AccidentDetector();
		speedCam.setDetector(accident);
		speedCam.setReporter(videoReporter);
		
		speedCam.detect();
		speedCam.report();
		System.out.println("-------------------------------------");

		Detectable speed = new SpeedCam();
		
		if (speed instanceof SpeedCam) {
			SpeedCam s = (SpeedCam)speed;
			s.setDetector(advancedFireDetector);
			s.setReporter(videoReporter);
			s.detect();
			s.report();
		}				
				
	}
}
