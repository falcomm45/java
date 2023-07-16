package chap_12;

import chap_12.clean.CleanRunnable;

public class _02_Runnable {
	public static void main(String[] args) {
		CleanRunnable cleanRunnable = new CleanRunnable();
		Thread thread = new Thread(cleanRunnable);
		thread.start();
		
		cleanByBoss();
	}
	
	public static void cleanByBoss() {
		System.out.println("-- 보스 청소 시작 --");
		for (int i = 1; i < 11; i+=2) {
			System.out.println("(보스) " + i + "번방 청소 중");
		}
		System.out.println("-- 보스 청소 끝 --");
	}
}
