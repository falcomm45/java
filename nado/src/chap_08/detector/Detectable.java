package chap_08.detector;

public interface Detectable {
	String name = "감지자";
 // (public static final)
 // 인터페이스 내부에서 만들어지는 모든 변수는 자동으로 public static final 을 생략하고있다.
	
	void detect(); // 감지
 // (public abstract)
 // 인터페이스 내부에서 만들어지는 모든 메소드는 자동으로 public abstract 를 생략하고있다.
 //	=========> 정적상수와 추상메소드만 사용할 수 있다.
}
