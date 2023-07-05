 package chap_08.reporter;

public class NomalReporter implements Reportable {
				// Reportable 이라는 인터페이스를 구현하고있다.
	@Override
	public void report() {
		System.out.println("일반 화재 신고를 진행합니다.");
	}
	
}
