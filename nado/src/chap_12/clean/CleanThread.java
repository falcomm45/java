package chap_12.clean;

public class CleanThread extends Thread{
	// Thread class�� ���
	public void run() {
		System.out.println("-- ���� û�� ����(Thread) --");
		for (int i = 2; i < 11; i+=2) {
			System.out.println("(����) " + i + "���� û�� ��(Thread)");
		}
		System.out.println("-- ���� û�� ��(Thread) --");
	}
}
