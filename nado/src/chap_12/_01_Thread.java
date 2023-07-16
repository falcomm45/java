package chap_12;

import chap_12.clean.CleanThread;

public class _01_Thread {
	public static void main(String[] args) {
		// �ϳ��� ���μ��� (Process)
		// ������ (Thread)
		
		// 1 3 5 7  9
		// 2 4 6 8 10
		
		// cleanBySelf();
		CleanThread cleanThread = new CleanThread();
		// cleanThread.run(); // ���� û��
		cleanThread.start();
		
		cleanByBoss(); // ���� û��
	}
	
	
	public static void cleanBySelf() {
		System.out.println("-- ȥ�ڼ� û�� ���� --");
		for (int i = 0; i < 11; i+=2) {
			System.out.println("(ȥ��) " + i + "���� û�� ��");
		}
		System.out.println("-- ȥ�� û�� �� --");
	}
	
	public static void cleanByBoss() {
		System.out.println("-- ���� û�� ���� --");
		for (int i = 1; i < 11; i+=2) {
			System.out.println("(����) " + i + "���� û�� ��");
		}
		System.out.println("-- ���� û�� �� --");
	}
}
