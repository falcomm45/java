package chap_12.clean;

public class CleanThread extends Thread{
	// Thread class甫 惑加
	public void run() {
		System.out.println("-- 流盔 没家 矫累(Thread) --");
		for (int i = 2; i < 11; i+=2) {
			System.out.println("(流盔) " + i + "锅规 没家 吝(Thread)");
		}
		System.out.println("-- 流盔 没家 场(Thread) --");
	}
}
