package _06_20;

// ������� ���ο� ���η� ��ü�� �����ϴ� ������
// ������ ��ȯ�ϴ� getArea(), �ѷ��� ��ȯ�ϴ� getCircumference()

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
		System.out.println("�簢���� ���� : " + rc.getArea());
		System.out.println("�簢���� �ѷ� : " + rc.getCircumference());
	}
	
}
