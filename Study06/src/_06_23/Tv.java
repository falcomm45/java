package _06_23;

public class Tv {
	public static void main(String[] args) {
		Tv tv = new Tv("LG", 2020, 32);
		tv.printInfo();
	}
	
	String maker;
	
	int productYear;
	
	int inch;
	
	Tv(String maker, int productYear, int inch) {
		this.maker = maker;
		this.productYear = productYear;
		this.inch = inch;
	}
	
	void printInfo() {
		System.out.println("������ : " + maker);
		System.out.println("����⵵ : " + productYear + "��");
		System.out.println("ũ��  : " + inch + "��ġ");
	}
}
