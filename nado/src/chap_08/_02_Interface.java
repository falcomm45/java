package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;
import chap_08.detector.*;
import chap_08.reporter.*;

public class _02_Interface {
	public static void main(String[] args) {
		
		// �������̽�
		
		NomalReporter nomalReporter = new NomalReporter();
		nomalReporter.report();
		
		VideoReporter videoReporter = new VideoReporter();
		videoReporter.report();
		
		Reportable nomalReporter2 = new NomalReporter();
		Reportable videoReporter2 = new VideoReporter();
		
		// �������̽��� ���������ν� �������̽��� �����ϴ� ��� Ŭ�������� �������̽� ��ü�� ���ؼ� ������ �� �ִ�.
		// Reportable �������̽��� �����ϱ� ���ؼ��� �߻�޼ҵ� report �� ������ �������̵� �ؾ��ϹǷ�
		// Reportable �������̽��� ������ ��� Ŭ�������� �������� report �޼ҵ带 ������ �������ִ�.
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
