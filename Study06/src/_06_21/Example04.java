package _06_21;

public class Example04 {
	
	public static void main(String[] args) {
		   PositivePoint p = new PositivePoint();
		   p.move(10, 10);
		   System.out.println(p.toString()+"입니다.");
		   p.move(-5,5); // 객체 p는 음수 공간으로 이동되지 않음
		   System.out.println(p.toString()+"입니다.");
		   PositivePoint p2 = new PositivePoint(-10, -10);
		   System.out.println(p2.toString()+"입니다.");
		}
//		(10,10)의 점입니다.
//		(10,10)의 점입니다.
//		(0,0)의 점입니다.
}



class PositivePoint extends Point {
	
	PositivePoint(){}
	
	PositivePoint(int x, int y) {
		super(x,y);
		if (x < 0 || y < 0) {
			super.move(0, 0);
			}	
	}
	
	
	public void move (int x, int y) {
		if (x < 0 || y < 0) {
			return;
		} else {
			super.move(x, y);
		}
	}
	
	public String toString() {
		return "(" + getX() + ", " + getY() + ")의 점";
	}
	
}





















class Point3D extends Point{
	
	private int z;
	
	Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	
	public void moveUp() {
		z++;
	}
	public void moveDown() {
		z--;
	}
	
	public void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
	
	
	@Override
	public String toString() {
		return "(" + getX() + ", " + getY() + ", " + z + ") 의 점";
	}
}




class ColorPoint extends Point{
	private String color;
	public ColorPoint() {
		color = "Black";
	}
	public ColorPoint(int x, int y) {
		super(x,y);
	}
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	
	void setXY(int x, int y) {
		super.move(x, y);
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return color + "색의 " + "(" + super.getX() + ", " + super.getY() + ")의 점";
	}
}



class Point {
	private int x, y;
	
	public Point() {
		x = 0;
		y = 0;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}