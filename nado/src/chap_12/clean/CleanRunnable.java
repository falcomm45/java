package chap_12.clean;

public class CleanRunnable implements Runnable{
	// Runnable interface�� ����
	// �ٸ� �θ� Ŭ������ ����ؾ� �Ѵٸ� Thread class �� ����ϴ� ��� Runnable interface�� ����
	
	@Override
	public void run() {
		System.out.println("-- ���� û�� ����(Runnable) --");
		for (int i = 2; i < 11; i+=2) {
			System.out.println("(����) " + i + "���� û�� ��(Runnable)");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("-- ���� û�� ��(Runnable) --");
	}

}
