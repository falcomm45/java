package chap_11;

public class _01_TryCatch {
	public static void main(String[] args) {
		// 예외 처리
		// 오류 : 컴파일 오류, 런타임 오류 (에러 error, 예외 exception)
		// 에러 (error) : 코드로 처리 할 수 없어서 발생하기 전에 방지해야함
		// 예외(exception) : 코드로 처리할 수 있음
		
		// int i = "문자열";  -> 컴파일 오류
		
		// int[] arr = new int[3];
		// arr[5] = 100;	-> 런타임 오류
		
		// S s = new S();
		// S s = null;
		// s.methodA(); 
		
		try {
			// System.out.println(3 / 0);
			
			// int[] arr = new int[3];
			// arr[5] = 100;
			
			Object obj = "test";
			System.out.println((int)obj);
			
		} catch (Exception e) {
			System.out.println("문제 발생 ==>  " + e.getMessage());
			e.printStackTrace();
		}
		

		System.out.println("프로그램 정상 종료");
	}
}


//class S {
//	
//	public void methodA() {
//		this.methodA();
//	}
//}