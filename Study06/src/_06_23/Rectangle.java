package _06_23;

public class Rectangle {
	
	private double width;
	
	private double height;
	
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		return width * height;
	}
	
	double getCircumference() {
		return (width + height)*2;
	}
	
	public static void main(String[] args) {
		Rectangle rc = new Rectangle(3.82, 8.65);
		System.out.println("면적 : " + rc.getArea());
		System.out.println("둘레 : " + rc.getCircumference());
	}
}
