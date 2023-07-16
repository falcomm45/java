package chap_12;
// 상품 A 와 상품 B 는 각각 5개씩 준비
// 상품 A 와 상품 B 는 두 사람이 독립적으로 준비
// 상품 A 와 상품 B 가 모두 준비된 이후 세트 상품 포장 시작
// 포장이 필요한 세트 상품은 총 5개
public class _Quiz_12 extends Thread{
	public static void main(String[] args) {
		Runnable run1 = new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i < 6; i++) {
					System.out.println("A 상품 준비 " + i + "/5");
				}
				System.out.println("-- A 상품 준비 완료 --");
			}
		};
		
		Runnable run2 = () -> {
			for (int i = 1; i < 6; i++) {
				System.out.println("B 상품 준비 " + i + "/5");
				}
			System.out.println("-- B 상품 준비 완료 --");
		};
		
		Runnable run3 = () -> {
			System.out.println("== 세트 상품 포장 시작 ==");
			for (int i = 1; i < 6; i++) {
				System.out.println("세트 상품 포장 " + i + "/5");
			}
			System.out.println("== 세트 상품 포장 완료 ==");
		};
		
		Thread thread1 = new Thread(run1);
		Thread thread2 = new Thread(run2);
		Thread thread3 = new Thread(run3);
		
		thread1.start();
		thread2.start();
		
		while (thread1.isAlive() || thread2.isAlive()) {}
		// isAlive -> thread1 또는 thread2 가 살아 있을 경우 = true
		
//		try {
//			thread1.join();
//			thread2.join();
//		} catch (InterruptedException e) {
//			throw new RuntimeException(e);
//		}
		
		thread3.start();
		
		
	}
	
	
}


