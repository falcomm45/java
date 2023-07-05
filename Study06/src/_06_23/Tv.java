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
		System.out.println("제조사 : " + maker);
		System.out.println("생산년도 : " + productYear + "년");
		System.out.println("크기  : " + inch + "인치");
	}
}
