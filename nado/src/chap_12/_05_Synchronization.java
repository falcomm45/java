package chap_12;

import chap_12.clean.Room;

public class _05_Synchronization {
	public static void main(String[] args) {
		Room room = new Room();
		
		Runnable cleaner1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("-- ����1 û�� ���� --");
				for (int i = 1; i < 6; i++) {
					room.clean("����1");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					if (i == 2) {
						throw new RuntimeException("GG");
					}
				}
				System.out.println("-- ����1 û�� �� --");
			}
		};
		
		Runnable cleaner2 = () -> {
			System.out.println("-- ����2 û�� ���� --");
			for (int i = 1; i < 6; i++) {
				room.clean("����2");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
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
