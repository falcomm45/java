package _06_23;

public class SquareExample {
	public static void main(String[] args) {
		Square s1 = new Square(1, 1, 12.5, 13.5);
		Square s2 = new Square(3, 5, 5.5, 7.5);
		Square s3 = new Square(3, 9, 15.5, 21.5);
		s1.create();
		s2.create();
		s3.create();
		s1.compareSquare(s1, s2, s3);
		
	}
	
	
	
}


class Square {
	
	int x;
	int y;
	double width;
	double height;
	Square square;
	
	
	Square(int x, int y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void create() {
		System.out.println("������ (" + x + ", " + y + ") �̰� ���̰� " + width + "�̰� ���̰� " 
				+ height + "�� �簢���� ����ϴ�.");
	}
	
	public double getArea() {
		return width*height;
	}
	
	
	public void compareSquare(Square s1, Square s2, Square s3) {
		if (s1.getArea() < s2.getArea()) {
			System.out.println("s2�簢���� s1�簢����  ���ԵǾ� ���� �ʽ��ϴ�.");
		} else if (s1.x + s1.width > s2.x + s2.width && s1.y + s1.height > s2.y + s2.height) {
			System.out.println("s2�簢���� s1�簢���� ���ԵǾ� �ֽ��ϴ�.");
		} else {
			System.out.println("s2�簢���� s1�簢���� ���ԵǾ� ���� �ʽ��ϴ�.");
		}
		
		if (s1.getArea() < s3.getArea()) {
			System.out.println("s3�簢���� s1�簢����  ���ԵǾ� ���� �ʽ��ϴ�.");
		} else if (s1.x + s1.width > s3.x + s3.width && s1.y + s1.height > s3.y + s3.height) {
			System.out.println("s3�簢���� s1�簢���� ���ԵǾ� �ֽ��ϴ�.");
		} else {
			System.out.println("s3�簢���� s1�簢���� ���ԵǾ� ���� �ʽ��ϴ�.");
		}
		
	}
	
}