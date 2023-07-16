package chap_12;

import chap_12.clean.Room;

public class _05_Synchronization {
	public static void main(String[] args) {
		Room room = new Room();
		
		Runnable cleaner1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("-- 流盔1 没家 矫累 --");
				for (int i = 1; i < 6; i++) {
					room.clean("流盔1");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					if (i == 2) {
						throw new RuntimeException("GG");
					}
				}
				System.out.println("-- 流盔1 没家 场 --");
			}
		};
		
		Runnable cleaner2 = () -> {
			System.out.println("-- 流盔2 没家 矫累 --");
			for (int i = 1; i < 6; i++) {
				room.clean("流盔2");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
			System.out.println("-- 流盔2 没家 场 --");
		};
		
		Thread cleanerThread1 = new Thread(cleaner1);
		Thread cleanerThread2 = new Thread(cleaner2);
		
		cleanerThread1.start();
		cleanerThread2.start();
	}
}
