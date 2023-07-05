package _06_19;

import java.io.ObjectInputStream.GetField;

// ������ ������ Circle Ŭ������ ����� ������ �����ϴ� Cylinder Ŭ������ �ۼ��Ͻÿ�.

// ������ ��Ÿ���� Cylinder Ŭ������ Circle���� ���� �Ǽ����� ���̸� �ʵ�� ����

// �޼ҵ� getVolume()�� ������ ���Ǹ� ��ȯ

// Cylinder Ŭ������ main() �޼ҵ忡�� �������� 2.8, ���̰� 5.6�� ������ ���Ǹ� ���

// ������ ���� ��Ÿ���� Ŭ���� Circle

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
