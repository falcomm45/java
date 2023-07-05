package _06_21;

public class Example03 {
	public static void main(String[] args) {
		ColorTv myTv = new ColorTv(32,1024);
		myTv.printProperty();
		IpTv ip = new IpTv("192.1.1.2", 32, 2048);
		ip.printProperty();
	}
}

class Tv {
	private int size;
	
	public Tv (int size) {
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
}

class ColorTv extends Tv{
	private int color;
	
	ColorTv(int size, int color) {
		super(size);
		this.color = color;
	}
	
	public int getColor() {
		return color;
	}
	
	
	public void printProperty() {
		System.out.println(super.getSize() + "��ġ " + color + "�÷�");
	}
}

class IpTv extends ColorTv {
	
	String ip;
	
	IpTv(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}
	
	@Override
	public void printProperty() {
		System.out.println("���� IPTV�� " + ip + " �ּ��� " + super.getSize() + "��ġ " + super.getColor() + "�÷�");
	}
}


