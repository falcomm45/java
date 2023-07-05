package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;

public class SpeedCam extends Camera implements Detectable, Reportable {
	
	private Detectable detector;
	private Reportable reporter;
	
	public void setDetector(Detectable detector) {
		this.detector = detector;
	}
	
	public void setReporter(Reportable reporter) {
		this.reporter = reporter;
	}
	
	@Override
	public void showMainFeature() {
		System.out.println("�ӵ� ����, ��ȣ �ν�");
	}

	@Override
	public void report() {
		reporter.report();
	}

	@Override
	public void detect() {
		detector.detect();
	}
	
	
	
	
	
	
}
