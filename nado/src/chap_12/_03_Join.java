package chap_12;

import chap_12.clean.CleanRunnable;

public class _03_Join {
	public static void main(String[] args) {
		CleanRunnable cleanRunnable = new CleanRunnable();
		Thread thread = new Thread(cleanRunnable);
		thread.start();
		
		try {
			thread.join(2500); // thread �� ���������� ��ٷ���
								// 2.5 �� ���
		} catch (InterruptedException e) {
			throw new RuntimeException();
		}
		
		cleanByBoss();
	}
	
	public static void cleanByBoss() {
		System.out.println("-- ���� û�� ���� --");
		for (int i = 1; i < 11; i+=2) {
			System.out.println("(����) " + i + "���� û�� ��");
			
			try {
				Thread.sleep(1000); // 1��
			} catch (InterruptedException e) {
				throw new RuntimeException();
			}
		}
		System.out.println("-- ���� û�� �� --");
	}
}
