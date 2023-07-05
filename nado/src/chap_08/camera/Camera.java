package chap_08.camera;

public abstract class Camera {
	// 해당 클래스로 객체를 만들지 못하게 하기 위해서 abstract 키워드를 이용할 수 도 있다.
	
	
	public void takePicture() {
		System.out.println("사진을 촬영합니다.");
	}
	
	public void recordVideo() {
		System.out.println("동영상을 녹화합니다.");
	}
	
	public abstract void showMainFeature(); // 메소드를 선언만 하고 끝냄
											// 자식 클래스에서 구현해야 하는 메소드
}
