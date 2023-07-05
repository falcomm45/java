package chap_08;

import chap_08.camera.SpeedCam;
import chap_08.detector.AccidentDetector;
import chap_08.reporter.VideoReporter;

// �������̽��� �̿��Ͽ� ���� �ܼ� ī�޶� ������ ���� �� �Ű����� �߰��Ͻÿ�

// ���Ӵܼ� ī�޶��� SpeedCam Ŭ������ detect(), report() ����
// ������ �����ϴ� AccidentDetector Ŭ���� �ű� ����
// �Ű� ����� ������ �ۼ��� VideoReporter Ŭ���� Ȱ��
// ��� Ŭ������ ������ ��ġ�� ����
public class _Quiz_08 {
	public static void main(String[] args) {
		SpeedCam speedCam = new  SpeedCam();
		speedCam.setDetector(new AccidentDetector());
		speedCam.setReporter(new VideoReporter());
		speedCam.detect();
		speedCam.report();
		// ���� ��� �����մϴ�
		// ���� 30�� ����� �Բ� �Ű��մϴ�.
	}
}
