package chap_12;
// ��ǰ A �� ��ǰ B �� ���� 5���� �غ�
// ��ǰ A �� ��ǰ B �� �� ����� ���������� �غ�
// ��ǰ A �� ��ǰ B �� ��� �غ�� ���� ��Ʈ ��ǰ ���� ����
// ������ �ʿ��� ��Ʈ ��ǰ�� �� 5��
public class _Quiz_12 extends Thread{
	public static void main(String[] args) {
		Runnable run1 = new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i < 6; i++) {
					System.out.println("A ��ǰ �غ� " + i + "/5");
				}
				System.out.println("-- A ��ǰ �غ� �Ϸ� --");
			}
		};
		
		Runnable run2 = () -> {
			for (int i = 1; i < 6; i++) {
				System.out.println("B ��ǰ �غ� " + i + "/5");
				}
			System.out.println("-- B ��ǰ �غ� �Ϸ� --");
		};
		
		Runnable run3 = () -> {
			System.out.println("== ��Ʈ ��ǰ ���� ���� ==");
			for (int i = 1; i < 6; i++) {
				System.out.println("��Ʈ ��ǰ ���� " + i + "/5");
			}
			System.out.println("== ��Ʈ ��ǰ ���� �Ϸ� ==");
		};
		
		Thread thread1 = new Thread(run1);
		Thread thread2 = new Thread(run2);
		Thread thread3 = new Thread(run3);
		
		thread1.start();
		thread2.start();
		
		while (thread1.isAlive() || thread2.isAlive()) {}
		// isAlive -> thread1 �Ǵ� thread2 �� ��� ���� ��� = true
		
//		try {
//			thread1.join();
//			thread2.join();
//		} catch (InterruptedException e) {
//			throw new RuntimeException(e);
//		}
		
		thread3.start();
		
		
	}
	
	
}


