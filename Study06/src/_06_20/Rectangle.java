package _06_20;

// 사격형의 가로와 세로로 객체를 생성하는 생성자
// 면적을 반환하는 getArea(), 둘레를 반환하는 getCircumference()

public class Rectangle {
	
	double width;
	double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public double getArea() {
		return width*length;
	}
	
	public double getCircumference() {
		return 2*(width+length);
	}
	
	public static void main(String[] args) {
		Rectangle rc = new Rectangle(3.82, 8.65);
		System.out.println("사각형의 면적 : " + rc.getArea());
		System.out.println("사각형의 둘레 : " + rc.getCircumference());
	}
	
}
