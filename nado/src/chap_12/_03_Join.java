package chap_12;

import chap_12.clean.CleanRunnable;

public class _03_Join {
	public static void main(String[] args) {
		CleanRunnable cleanRunnable = new CleanRunnable();
		Thread thread = new Thread(cleanRunnable);
		thread.start();
		
		try {
			thread.join(2500); // thread 가 끝날때까지 기다려라
								// 2.5 초 대기
		} catch (InterruptedException e) {
			throw new RuntimeException();
		}
		
		cleanByBoss();
	}
	
	public static void cleanByBoss() {
		System.out.println("-- 보스 청소 시작 --");
		for (int i = 1; i < 11; i+=2) {
			System.out.println("(보스) " + i + "번방 청소 중");
			
			try {
				Thread.sleep(1000); // 1초
			} catch (InterruptedException e) {
				throw new RuntimeException();
			}
		}
		System.out.println("-- 보스 청소 끝 --");
	}
}
