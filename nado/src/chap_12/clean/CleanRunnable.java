package chap_12.clean;

public class CleanRunnable implements Runnable{
	// Runnable interface를 구현
	// 다른 부모 클래스를 상속해야 한다면 Thread class 를 상속하는 대신 Runnable interface를 구현
	
	@Override
	public void run() {
		System.out.println("-- 직원 청소 시작(Runnable) --");
		for (int i = 2; i < 11; i+=2) {
			System.out.println("(직원) " + i + "번방 청소 중(Runnable)");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("-- 직원 청소 끝(Runnable) --");
	}

}
