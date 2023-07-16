package chap_12;

public class _04_MultiThread {
	public static void main(String[] args) {
		Runnable cleaner1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("-- ����1 û�� ���� --");
				for (int i = 1; i < 11; i+=2) {
					System.out.println("(����1) " + i + "���� û�� ��");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println("-- ����1 û�� �� --");
			}
		};
		
		Runnable cleaner2 = () -> {
			System.out.println("-- ����2 û�� ���� --");
			for (int i = 2; i < 11; i+=2) {
				System.out.println("(����2) " + i + "���� û�� ��");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("-- ����2 û�� �� --");
		};
		
		Thread cleanerThread1 = new Thread(cleaner1);
		Thread cleanerThread2 = new Thread(cleaner2);
		
		cleanerThread1.start();
		cleanerThread2.start();
	}
}
