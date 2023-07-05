package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {
	
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
		System.out.println("ȭ�� ����");
	}

	@Override
	public void report() {
		detector.detect();
	}

	@Override
	public void detect() {
		reporter.report();
	}
	
	
	
}
