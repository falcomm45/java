package chap_08.reporter;

public class VideoReporter implements Reportable {
				// Reportable 이라는 인터페이스를 구현하고있다.

	@Override
	public void report() {
		System.out.println("직전 30초 영상과 함께 신고를 진행합니다.");
	}

}
