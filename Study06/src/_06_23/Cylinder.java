package _06_23;

public class Cylinder {
	
	Circle circle;
	
	double height;
	
	Cylinder(Circle circle, double height) {
		this.circle = circle;
		this.height = height;
	}
	
	double getVolumn() {
		return circle.getArea()*height;
	}
	
	public static void main(String[] args) {
		Cylinder cy = new Cylinder(new Circle(2.8), 5.6);
		System.out.println(cy.getVolumn());
	}
	
}





class Circle {
	double radius;
	static double PI = 3.141592;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * PI;
	}
}
