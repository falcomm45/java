package _06_19;

import java.io.ObjectInputStream.GetField;

// 다음에 구현된 Circle 클래스를 참고로 다음을 만족하는 Cylinder 클래스를 작성하시오.

// 원통을 나타내는 Cylinder 클래스는 Circle형의 원과 실수형의 높이를 필드로 선언

// 메소드 getVolume()은 원통의 부피를 반환

// Cylinder 클래스의 main() 메소드에서 반지름이 2.8, 높이가 5.6의 원통의 부피를 출력

// 다음은 원을 나타내는 클래스 Circle

public class Example04 {

	public static void main(String[] args) {
		Cylinder cyl = new Cylinder(new Circle(2.8), 5.6);
		System.out.println(cyl.getVolume());
	}
}

class Cylinder {
	
	Circle circle;
	double height = 5.6;
	
	public Cylinder(Circle circle, double height) {
		this.circle = circle;
		this.height = height;
	}
	
	
	public double getVolume() {
		return circle.getArea()*height;
		
	}
	
	
}

class Circle {
	public double radius;
	public static double PI = 3.141592;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*PI;
	}
}
