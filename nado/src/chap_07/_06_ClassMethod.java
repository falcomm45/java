package chap_07;

public class _06_ClassMethod {
	public static void main(String[] args) {
//		BlackBox b1 = new BlackBox();
//		b1.callServiceCenter();
//		
//		BlackBox b2 = new BlackBox();
//		b2.callServiceCenter();
		
		BlackBox.callServiceCenter();
		// 객체를 생성하지 않고도 클래스이름.메소드명으로 호출 가능
		
		String s = String.valueOf(3);
		// 스트링 클래스의 valueOf 메소드
		// 객체 생성 없이 바로 정의 => 클래스메소드
	}
}
